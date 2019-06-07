package com.ldx.ibookcommon.service;

import com.ldx.ibookcommon.model.User;

/**
 * @author ldx
 * @date 2019/6/2 14:07
 * @Description:
 */
public interface UserService {
    public User findUserById(Integer id);
}
