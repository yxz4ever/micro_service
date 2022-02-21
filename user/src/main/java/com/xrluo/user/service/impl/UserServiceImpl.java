package com.xrluo.user.service.impl;

import com.xrluo.user.entity.SysUser;
import com.xrluo.user.dao.UserDao;
import com.xrluo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getById(Long id) {
        System.out.println("调用userService");
        return userDao.getById(id);
    }
}
