package com.xrluo.test.controller;

import com.xrluo.test.clients.UserClient;
import com.xrluo.test.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserClient userClient;

    @RequestMapping("/wel")
    public String wel() {
        return "welcome micro_service";
    }

    @RequestMapping("/{id}")
    public SysUser userInfo(@PathVariable("id") Long id) {
        return userClient.findById(id);
    }

}
