package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_wechat_group")
public class Wechagroup {
    /**
     * 群标识
     */
    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    /**
     * 微信群的唯一标识
     */
    @Column(name = "wechat_opengid")
    private String wechatOpengid;

    /**
     * 群名称
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 状态，默认1,0无效 1有效
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
     * 获取群标识
     *
     * @return group_id - 群标识
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 设置群标识
     *
     * @param groupId 群标识
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取微信群的唯一标识
     *
     * @return wechat_opengid - 微信群的唯一标识
     */
    public String getWechatOpengid() {
        return wechatOpengid;
    }

    /**
     * 设置微信群的唯一标识
     *
     * @param wechatOpengid 微信群的唯一标识
     */
    public void setWechatOpengid(String wechatOpengid) {
        this.wechatOpengid = wechatOpengid;
    }

    /**
     * 获取群名称
     *
     * @return group_name - 群名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置群名称
     *
     * @param groupName 群名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取状态，默认1,0无效 1有效
     *
     * @return status - 状态，默认1,0无效 1有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，默认1,0无效 1有效
     *
     * @param status 状态，默认1,0无效 1有效
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