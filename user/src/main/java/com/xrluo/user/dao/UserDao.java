package com.xrluo.user.dao;

import com.xrluo.user.entity.SysUser;

public interface UserDao {
    SysUser getById(Long id);
}
