package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_banner")
public class Banner {
    @Id
    @Column(name = "banner_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bannerId;

    /**
     * 图片路径
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 链接地址
     */
    @Column(name = "image_link")
    private String imageLink;

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
     * 更新时间
     */
    @Column(name = "updated_date")
    private Date updatedDate;

    /**
     * @return banner_id
     */
    public Long getBannerId() {
        return bannerId;
    }

    /**
     * @param bannerId
     */
    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    /**
     * 获取图片路径
     *
     * @return image_url - 图片路径
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图片路径
     *
     * @param imageUrl 图片路径
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取链接地址
     *
     * @return image_link - 链接地址
     */
    public String getImageLink() {
        return imageLink;
    }

    /**
     * 设置链接地址
     *
     * @param imageLink 链接地址
     */
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
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