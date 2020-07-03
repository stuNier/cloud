package com.zx.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.zx.core.consts.EncodingType;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * Title: AuthFilter
 * Description: auth filter
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/6/12 17:49
 */
@Component
@RefreshScope
public class AuthFilter extends ZuulFilter {

    /**
     * @return Object
     * @exception ZuulException ZuulException
     * @author: zhengxin-3@thunisoft.com
     * date: 20-06-24 18:34
     * @version 1.0
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletResponse response =  requestContext.getResponse();
        response.setCharacterEncoding(EncodingType.UTF_8);
        return null;
    }

    /**
     * 过滤器类型
     *
     * @return pre前置过滤器
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 优先级 数字越小优先级越高
     *
     * @return 0
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行该过滤器
     *
     * @return true
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }
}
