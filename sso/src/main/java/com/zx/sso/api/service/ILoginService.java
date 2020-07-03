package com.zx.sso.api.service;

import com.zx.sso.api.bean.User;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title: ILoginService
 * Description: ILoginService
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin@thunisoft.com
 * @version 1.0
 * date 2019/11/27 15:49
 */
public interface ILoginService {

    /**
     * 登录
     * @param request request
     * @param response response
     * @param user user
     * @return Object
     * @author: zhengxin-3@thunisoft.com
     * date: 20-02-19 9:28
     * version 1.0
     */
    Object login(HttpServletRequest request, HttpServletResponse response, User user);

    /**
     * 登出
     * @param request request
     * @return void
     * @author: zhengxin-3@thunisoft.com
     * date: 20-02-19 9:28
     * version 1.0
     */
    void loginOut(HttpServletRequest request);

    /**
     * 登录状态
     * @param request request
     * @return HttpStatus
     * @author: zhengxin-3@thunisoft.com
     * date: 20-07-01 17:46
     * @version 1.0
     */
    HttpStatus authToken(HttpServletRequest request);
}
