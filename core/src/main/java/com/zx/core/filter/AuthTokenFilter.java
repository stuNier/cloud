package com.zx.core.filter;

import com.alibaba.fastjson.JSON;
import com.zx.core.consts.EncodingType;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Title: AuthTokenFilter
 * Description: token过滤器
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/2 16:39
 */
public class AuthTokenFilter extends OncePerRequestFilter {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * @param request request
     * @param response response
     * @param filterChain filterChain
     * @return void
     * @author: zhengxin-3@thunisoft.com
     * date: 20-07-02 16:41
     * @version 1.0
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("token");
        if(StringUtils.isNotBlank(token)){
            String tokenValue = stringRedisTemplate.opsForValue().get(token);
            if(StringUtils.isNotBlank(tokenValue)){
                filterChain.doFilter(request, response);
            }else {
                handleResponse(request, response);
            }
        }
        handleResponse(request, response);
    }

    /**
     * 响应结果
     * @param request request
     * @param response response
     * @return void
     * @author: zhengxin-3@thunisoft.com
     * date: 20-07-02 16:54
     * @version 1.0
     */
    private void handleResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding(EncodingType.UTF_8);
        PrintWriter out = response.getWriter();
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setContentType("application/json; charset=utf-8");
        response.setStatus(401);
        out.print(JSON.toJSONString("未登录"));
        out.flush();
        out.close();
    }
}
