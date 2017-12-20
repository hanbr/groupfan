package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_goods_photo")
public class GoodsPhoto {
    @Id
    @Column(name = "photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long photoId;

    /**
     * 商品标识
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 图片路径
     */
    @Column(name = "photo_url")
    private String photoUrl;

    /**
     * 用户标识
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态 默认1,0无效，1有效
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "created_date")
    private Date createdDate;

    /**
     * 修改时间
     */
    @Column(name = "updated_date")
    private Date updatedDate;

    /**
     * @return photo_id
     */
    public Long getPhotoId() {
        return photoId;
    }

    /**
     * @param photoId
     */
    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
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
     * 获取图片路径
     *
     * @return photo_url - 图片路径
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 设置图片路径
     *
     * @param photoUrl 图片路径
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * 获取用户标识
     *
     * @return user_id - 用户标识
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
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * 获取修改时间
     *
     * @return updated_date - 修改时间
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 设置修改时间
     *
     * @param updatedDate 修改时间
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}