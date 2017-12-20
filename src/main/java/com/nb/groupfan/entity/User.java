package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 官方用户微信openid
     */
    @Column(name = "wechat_openid")
    private String wechatOpenid;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户头像
     */
    @Column(name = "user_head")
    private String userHead;

    /**
     * 微信地址
     */
    private String address;

    /**
     * 性别 1男 2女
     */
    private String sex;

    /**
     * 状态 ，默认1 ，0无效 1有效
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "created_date")
    private Date createdDate;

    /**
     * 更新时间
     */
    @Column(name = "updated_date")
    private Date updatedDate;

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取官方用户微信openid
     *
     * @return wechat_openid - 官方用户微信openid
     */
    public String getWechatOpenid() {
        return wechatOpenid;
    }

    /**
     * 设置官方用户微信openid
     *
     * @param wechatOpenid 官方用户微信openid
     */
    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    /**
     * 获取微信地址
     *
     * @return address - 微信地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置微信地址
     *
     * @param address 微信地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取性别 1男 2女
     *
     * @return sex - 性别 1男 2女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别 1男 2女
     *
     * @param sex 性别 1男 2女
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取状态 ，默认1 ，0无效 1有效
     *
     * @return status - 状态 ，默认1 ，0无效 1有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 ，默认1 ，0无效 1有效
     *
     * @param status 状态 ，默认1 ，0无效 1有效
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return created_date - 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取更新时间
     *
     * @return updated_date - 更新时间
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 设置更新时间
     *
     * @param updatedDate 更新时间
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}