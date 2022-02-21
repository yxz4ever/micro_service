package com.xrluo.user.dao.impl;
import java.util.Date;

import com.xrluo.user.dao.UserDao;
import com.xrluo.user.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public SysUser getById(Long id) {
        SysUser user = new SysUser();
        user.setId(0L);
        user.setDeptId(0);
        user.setUsername("hahahaa");
        user.setPassword("");
        user.setSalt("");
        user.setAvatarUrl("");
        user.setRealname("");
        user.setSex(0);
        user.setBirthday(new Date());
        user.setEmail("");
        user.setPhone("");
        user.setStatus(0);
        user.setRemark("");
        user.setSortNumber(0);
        user.setCreateId(0L);
        user.setUpdateId(0L);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setDeleted(0);
        return user;
    }
}
