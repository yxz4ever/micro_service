package com.xrluo.user.controller;

import com.xrluo.user.entity.SysUser;
import com.xrluo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public SysUser detail(@PathVariable("id") Long id){
        return userService.getById(id);
    }
}
