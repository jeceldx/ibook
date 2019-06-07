package com.ldx.ibookprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ldx.ibookcommon.model.User;
import com.ldx.ibookcommon.service.UserService;
import com.ldx.ibookprovider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ldx
 * @date 2019/6/2 14:23
 * @Description:
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        return userMapper.getOne(1);
    }
}
