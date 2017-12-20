package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_message")
public class Message {
    @Id
    @Column(name = "msg_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msgId;

    /**
     * 商品标识
     */
    @Column(name = "group_id")
    private Long groupId;

    /**
     * 商品标识，可为空
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 发送用户标识
     */
    @Column(name = "send_user")
    private Long sendUser;

    /**
     * 接收用户标识
     */
    @Column(name = "sale_user")
    private Long saleUser;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息类型，1系统消息，2普通消息
     */
    private String type;

    /**
     * 状态 默认1,0无效，1有效
     */
    private String status;

    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 阅读时间
     */
    @Column(name = "read_time")
    private Date readTime;

    /**
     * @return msg_id
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * @param msgId
     */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    /**
     * 获取商品标识
     *
     * @return group_id - 商品标识
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 设置商品标识
     *
     * @param groupId 商品标识
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取商品标识，可为空
     *
     * @return goods_id - 商品标识，可为空
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品标识，可为空
     *
     * @param goodsId 商品标识，可为空
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取发送用户标识
     *
     * @return send_user - 发送用户标识
     */
    public Long getSendUser() {
        return sendUser;
    }

    /**
     * 设置发送用户标识
     *
     * @param sendUser 发送用户标识
     */
    public void setSendUser(Long sendUser) {
        this.sendUser = sendUser;
    }

    /**
     * 获取接收用户标识
     *
     * @return sale_user - 接收用户标识
     */
    public Long getSaleUser() {
        return saleUser;
    }

    /**
     * 设置接收用户标识
     *
     * @param saleUser 接收用户标识
     */
    public void setSaleUser(Long saleUser) {
        this.saleUser = saleUser;
    }

    /**
     * 获取消息内容
     *
     * @return content - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取消息类型，1系统消息，2普通消息
     *
     * @return type - 消息类型，1系统消息，2普通消息
     */
    public String getType() {
        return type;
    }

    /**
     * 设置消息类型，1系统消息，2普通消息
     *
     * @param type 消息类型，1系统消息，2普通消息
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取状态 默认1,0无效，1有效
     *
     * @return status - 状态 默认1,0无效，1有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 默认1,0无效，1有效
     *
     * @param status 状态 默认1,0无效，1有效
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取发送时间
     *
     * @return send_time - 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发送时间
     *
     * @param sendTime 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取阅读时间
     *
     * @return read_time - 阅读时间
     */
    public Date getReadTime() {
        return readTime;
    }

    /**
     * 设置阅读时间
     *
     * @param readTime 阅读时间
     */
    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }
}