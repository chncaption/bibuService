package com.bibu.entity;

import java.io.Serializable;

/**
 * 后台管理员表(Admin)实体类
 *
 * @author WeitJack
 * @since 2022-01-04 21:59:39
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 557579569479606933L;
    /**
     * id
     */
    private Integer id;
    /**
     * 账号
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 别名
     */
    private String alias;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 状态
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

