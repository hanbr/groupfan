package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_collect")
public class UserCollect {
    @Id
    @Column(name = "collect_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long collectId;

    /**
     * 用户标识
     */
    @Column(name = "user_Id")
    private Long userId;

    /**
     * 商品标识
     */
    @Column(name = "goods_id")
    private Long goodsId;

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
     * @return collect_id
     */
    public Long getCollectId() {
        return collectId;
    }

    /**
     * @param collectId
     */
    public void setCollectId(Long collectId) {
        this.collectId = collectId;
    }

    /**
     * 获取用户标识
     *
     * @return user_Id - 用户标识
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户标识
     *
     * @param userId 用户标识
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取商品标识
     *
     * @return goods_id - 商品标识
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品标识
     *
     * @param goodsId 商品标识
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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