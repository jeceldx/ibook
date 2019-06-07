package com.ldx.ibookconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ldx.ibookcommon.model.User;
import com.ldx.ibookcommon.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ldx
 * @date 2019/6/2 14:36
 * @Description:
 */
@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("路径正确！");
        System.out.println(userService.hashCode()+"!");
        return userService.findUserById(1);
    }
}