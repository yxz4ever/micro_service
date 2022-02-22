package com.xrluo.test.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户表
 *
 * @TableName sys_user
 */
public class SysUser implements Serializable {
    private static final long    serialVersionUID = 1L;
    /**
     *
     */
    private              Long    id;
    /**
     * 归属部门ID
     */
    private              Integer deptId;
    /**
     * 用户名
     */
    private              String  username;
    /**
     * 密码
     */
    private              String  password;
    /**
     *
     */
    private              String  salt;
    /**
     * 头像
     */
    private              String  avatarUrl;
    /**
     * 真实姓名
     */
    private              String  realname;
    /**
     * 性别 0 男 1女
     */
    private              Integer sex;
    /**
     * 生日
     */
    private              Date    birthday;
    /**
     * 邮箱
     */
    private              String  email;
    /**
     * 手机号
     */
    private              String  phone;
    /**
     * 用户状态 0 正常 1禁用
     */
    private              Integer status;
    /**
     * 其他备注
     */
    private              String  remark;
    /**
     * 排序
     */
    private              Integer sortNumber;
    /**
     *
     */
    private              Long    createId;
    /**
     *
     */
    private              Long    updateId;
    /**
     * 创建时间
     */
    private              Date    createTime;
    /**
     * 更新时间
     */
    private              Date    updateTime;
    /**
     * 数据状态 0 正常 1 删除
     */
    private              Integer deleted;

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 归属部门ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 归属部门ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     */
    public String getSalt() {
        return salt;
    }

    /**
     *
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 性别 0 男 1女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别 0 男 1女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 用户状态 0 正常 1禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户状态 0 正常 1禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 其他备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 其他备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 排序
     */
    public Integer getSortNumber() {
        return sortNumber;
    }

    /**
     * 排序
     */
    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    /**
     *
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     *
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     *
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     *
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据状态 0 正常 1 删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 数据状态 0 正常 1 删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                       && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
                       && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                       && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                       && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
                       && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
                       && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
                       && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
                       && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
                       && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                       && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                       && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                       && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                       && (this.getSortNumber() == null ? other.getSortNumber() == null : this.getSortNumber().equals(
                other.getSortNumber()))
                       && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
                       && (this.getUpdateId() == null ? other.getUpdateId() == null : this.getUpdateId().equals(other.getUpdateId()))
                       && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(
                other.getCreateTime()))
                       && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(
                other.getUpdateTime()))
                       && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime  = 31;
        int       result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSortNumber() == null) ? 0 : getSortNumber().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deptId=").append(deptId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", realname=").append(realname);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", sortNumber=").append(sortNumber);
        sb.append(", createId=").append(createId);
        sb.append(", updateId=").append(updateId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}