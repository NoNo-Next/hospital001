package com.blue.hospital.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户类
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String userpwd;

    /**
     * 盐
     */
    private String salt;

    /**
     * 性别
     */
    private String usersex;

    /**
     * 头像
     */
    private String userphoto;

    /**
     * 卡片
     */
    private String usercard;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 岗位编号
     */
    private Integer postid;

    /**
     * 用户状态
     */
    private Integer state;

    /**
     * 病区号
     */
    private Integer icuid;

    /**
     * 描述
     */
    private String descc;
    
    private Position position;

    /**
     * 科室ID
     */
    private int departmentId;

    /**
     * 科室名称
     */
    private Department department;

	private static final long serialVersionUID = 1L;

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
        User other = (User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserpwd() == null ? other.getUserpwd() == null : this.getUserpwd().equals(other.getUserpwd()))
            && (this.getUsersex() == null ? other.getUsersex() == null : this.getUsersex().equals(other.getUsersex()))
            && (this.getUserphoto() == null ? other.getUserphoto() == null : this.getUserphoto().equals(other.getUserphoto()))
            && (this.getUsercard() == null ? other.getUsercard() == null : this.getUsercard().equals(other.getUsercard()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getPostid() == null ? other.getPostid() == null : this.getPostid().equals(other.getPostid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIcuid() == null ? other.getIcuid() == null : this.getIcuid().equals(other.getIcuid()))
            && (this.getDescc() == null ? other.getDescc() == null : this.getDescc().equals(other.getDescc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserpwd() == null) ? 0 : getUserpwd().hashCode());
        result = prime * result + ((getUsersex() == null) ? 0 : getUsersex().hashCode());
        result = prime * result + ((getUserphoto() == null) ? 0 : getUserphoto().hashCode());
        result = prime * result + ((getUsercard() == null) ? 0 : getUsercard().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getPostid() == null) ? 0 : getPostid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getIcuid() == null) ? 0 : getIcuid().hashCode());
        result = prime * result + ((getDescc() == null) ? 0 : getDescc().hashCode());
        return result;
    }
}