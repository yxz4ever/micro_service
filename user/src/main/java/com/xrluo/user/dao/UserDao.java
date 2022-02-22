package com.xrluo.user.dao;

import com.xrluo.user.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository()
public interface UserDao {
    SysUser getById(Long id);
}
