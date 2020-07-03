package com.zx.sso.api.service.impl;

import com.zx.sso.api.bean.User;
import com.zx.core.enums.TimeEnum;
import com.zx.sso.api.service.ILoginService;
import com.zx.sso.api.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Title: LoginServiceImpl
 * Description: 登录Controller
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin@thunisoft.com
 * @version 1.0
 * date 2019/11/27 15:50
 */
@Slf4j
@Service
public class LoginServiceImpl implements ILoginService {

    private final JedisPool jedisPool;

    private final IUserService userService;

    /**
     * 构造函数
     * @param jedisPool jedisPool
     * @param userService userService
     */
    @Autowired
    public LoginServiceImpl(JedisPool jedisPool, IUserService userService) {
        this.jedisPool = jedisPool;
        this.userService = userService;
    }

    @Override
    public Object login(HttpServletRequest request, HttpServletResponse response, User user) {
        log.info(user.toString());
        User result = userService.queryByAccount(user.getAccount());
        if(null==result || !result.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("failed");
        }
        Jedis jedis = jedisPool.getResource();
        String token = DigestUtils.md5Hex(user.getAccount()+new Date().toString());
        jedis.set(token, user.getAccount());
        jedis.expire(token, TimeEnum.TWELVE_MINUTES.getCode());
        jedis.close();
        Cookie cookie = new Cookie("userAccount",token);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        return ResponseEntity.ok("success");
    }

    @Override
    public void loginOut(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(null == cookies) {
            return;
        }
        Jedis jedis = jedisPool.getResource();
        for (Cookie cookie:cookies) {
            if("userAccount".equals(cookie.getName())
                    && Boolean.TRUE.equals(jedis.exists(cookie.getValue()))){
                jedis.del(cookie.getValue());
            }
        }
        jedis.close();
    }

    /**
     * 登录状态
     * @param request request
     * @return HttpStatus
     * @author: zhengxin-3@thunisoft.com
     * date: 20-07-01 17:46
     * @version 1.0
     */
    @Override
    public HttpStatus authToken(HttpServletRequest request) {
        String token = request.getHeader("token");
        if(StringUtils.isBlank(token)){
            return HttpStatus.UNAUTHORIZED;
        }
        Jedis jedis = jedisPool.getResource();
        if(Boolean.TRUE.equals(jedis.exists(token))){
            return HttpStatus.OK;
        }
        return HttpStatus.UNAUTHORIZED;
    }
}
