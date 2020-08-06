package com.zx.sso.api.service.impl;

import com.zx.sso.api.bean.User;
import com.zx.sso.api.mapper.UserMapper;
import com.zx.sso.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: UserService
 * Description: UserServiceImpl
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin@thunisoft.com
 * @version 1.0
 * date 2019/11/28 15:14
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByLoginId(String loginId) {
        return userMapper.selectByLoginId(loginId);
    }
}
