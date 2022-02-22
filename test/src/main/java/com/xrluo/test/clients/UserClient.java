package com.xrluo.test.clients;

import com.xrluo.test.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service")
public interface UserClient {
    @GetMapping("/user/user/{id}")
    SysUser findById(@PathVariable("id") Long id);
}
