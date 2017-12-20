package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_address")
public class UserAddress {
    /**
     * id主键
     */
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    /**
     * 与用户表关联的id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 收货人姓名
     */
    private String consignee;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 邮编
     */
    private String code;

    /**
     * 国家
     */
    private String country;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String distric;

    /**
     * 详细地址
     */
    @Column(name = "detailed_address")
    private String detailedAddress;

    /**
     * 是否是默认地址，1--是
     */
    private String selected;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态:1--有效,2--无效
     */
    private String status;

    /**
     * 添加时间
     */
    @Column(name = "cteated_date")
    private Date cteatedDate;

    /**
     * 修改时间
     */
    @Column(name = "updated_date")
    private Date updatedDate;

    /**
     * 获取id主键
     *
     * @return address_id - id主键
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 设置id主键
     *
     * @param addressId id主键
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取与用户表关联的id
     *
     * @return user_id - 与用户表关联的id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置与用户表关联的id
     *
     * @param userId 与用户表关联的id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取收货人姓名
     *
     * @return consignee - 收货人姓名
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人姓名
     *
     * @param consignee 收货人姓名
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取联系方式
     *
     * @return phone - 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系方式
     *
     * @param phone 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮编
     *
     * @return code - 邮编
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置邮编
     *
     * @param code 邮编
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return distric - 区
     */
    public String getDistric() {
        return distric;
    }

    /**
     * 设置区
     *
     * @param distric 区
     */
    public void setDistric(String distric) {
        this.distric = distric;
    }

    /**
     * 获取详细地址
     *
     * @return detailed_address - 详细地址
     */
    public String getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailedAddress 详细地址
     */
    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    /**
     * 获取是否是默认地址，1--是
     *
     * @return selected - 是否是默认地址，1--是
     */
    public String getSelected() {
        return selected;
    }

    /**
     * 设置是否是默认地址，1--是
     *
     * @param selected 是否是默认地址，1--是
     */
    public void setSelected(String selected) {
        this.selected = selected;
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
     * 获取状态:1--有效,2--无效
     *
     * @return status - 状态:1--有效,2--无效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态:1--有效,2--无效
     *
     * @param status 状态:1--有效,2--无效
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取添加时间
     *
     * @return cteated_date - 添加时间
     */
    public Date getCteatedDate() {
        return cteatedDate;
    }

    /**
     * 设置添加时间
     *
     * @param cteatedDate 添加时间
     */
    public void setCteatedDate(Date cteatedDate) {
        this.cteatedDate = cteatedDate;
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