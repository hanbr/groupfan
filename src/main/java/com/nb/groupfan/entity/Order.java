package com.nb.groupfan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class Order {
    /**
     * 订单号
     */
    @Id
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 商品标识
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 备注
     */
    @Column(name = "order_remark")
    private String orderRemark;

    /**
     * 商品总额
     */
    @Column(name = "total_price")
    private Double totalPrice;

    /**
     * 支付方式，默认1，微信支付， 2银联支付
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * 发布时间
     */
    @Column(name = "release_time")
    private Date releaseTime;

    @Column(name = "goods_kind")
    private String goodsKind;

    /**
     * 下单时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 成交时间
     */
    @Column(name = "deal_time")
    private Date dealTime;

    /**
     * 买家
     */
    @Column(name = "buy_user")
    private Long buyUser;

    /**
     * 卖家
     */
    @Column(name = "sale_user")
    private Long saleUser;

    /**
     * 送货地址
     */
    @Column(name = "addr_id")
    private Long addrId;

    @Column(name = "goods_name")
    private String goodsName;

    private String address;

    /**
     * 订单状态，0取消，1待支付，2支付成功， 3运输中，4交易结束，5退货
     */
    private String status;

    @Column(name = "goods_desc")
    private String goodsDesc;

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
     * 获取备注
     *
     * @return order_remark - 备注
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * 设置备注
     *
     * @param orderRemark 备注
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    /**
     * 获取商品总额
     *
     * @return total_price - 商品总额
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置商品总额
     *
     * @param totalPrice 商品总额
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取支付方式，默认1，微信支付， 2银联支付
     *
     * @return pay_type - 支付方式，默认1，微信支付， 2银联支付
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式，默认1，微信支付， 2银联支付
     *
     * @param payType 支付方式，默认1，微信支付， 2银联支付
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取发布时间
     *
     * @return release_time - 发布时间
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * 设置发布时间
     *
     * @param releaseTime 发布时间
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * @return goods_kind
     */
    public String getGoodsKind() {
        return goodsKind;
    }

    /**
     * @param goodsKind
     */
    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind;
    }

    /**
     * 获取下单时间
     *
     * @return create_time - 下单时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置下单时间
     *
     * @param createTime 下单时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取成交时间
     *
     * @return deal_time - 成交时间
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * 设置成交时间
     *
     * @param dealTime 成交时间
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * 获取买家
     *
     * @return buy_user - 买家
     */
    public Long getBuyUser() {
        return buyUser;
    }

    /**
     * 设置买家
     *
     * @param buyUser 买家
     */
    public void setBuyUser(Long buyUser) {
        this.buyUser = buyUser;
    }

    /**
     * 获取卖家
     *
     * @return sale_user - 卖家
     */
    public Long getSaleUser() {
        return saleUser;
    }

    /**
     * 设置卖家
     *
     * @param saleUser 卖家
     */
    public void setSaleUser(Long saleUser) {
        this.saleUser = saleUser;
    }

    /**
     * 获取送货地址
     *
     * @return addr_id - 送货地址
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * 设置送货地址
     *
     * @param addrId 送货地址
     */
    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    /**
     * @return goods_name
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * @param goodsName
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取订单状态，0取消，1待支付，2支付成功， 3运输中，4交易结束，5退货
     *
     * @return status - 订单状态，0取消，1待支付，2支付成功， 3运输中，4交易结束，5退货
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态，0取消，1待支付，2支付成功， 3运输中，4交易结束，5退货
     *
     * @param status 订单状态，0取消，1待支付，2支付成功， 3运输中，4交易结束，5退货
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return goods_desc
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * @param goodsDesc
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }
}