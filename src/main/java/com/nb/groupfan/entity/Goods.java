package com.nb.groupfan.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nb.groupfan.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "t_goods")
public class Goods {
    @Id
    @Column(name = "goods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goodsId;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 商品规格，JSON格式
[{“kindName”:”名称”,”price”:100,”count”:100},{...}]
     */
    @Column(name = "goods_kind")
    private String goodsKind;

    /**
     * 价格范围
     */
    private String price;

    /**
     * 是否上架，0未上架，1已上架，默认1
     */
    @Column(name = "is_release")
    private String isRelease;

    /**
     * 发布时间
     */
    @Column(name = "release_date")
    private Date releaseDate;

    /**
     * 运费，0为包邮
     */
    private Double freight;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 商品地址
     */
    private String address;

    /**
     * 状态，默认1, 0无效 1有效
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
     * 商品描述
     */
    @Column(name = "goods_desc")
    private String goodsDesc;


    @Transient
    @JoinColumn(name = "photos")
    private List<GoodsPhoto> photoList;
    /**
     * 封面
     */
    @Transient
    private String cover;

    /**
     * 规格及价格
     */
    @Transient
    private List<GoodsKind> kindList;

    /**
     * 用户名称
     */
    @Transient
    private String userName;
    /**
     * 用户头像，关联user获取user_head
     */
    @Transient
    private String userHead;

    /**
     * @return goods_id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品名称
     *
     * @return goods_name - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取商品规格，JSON格式
[{“kindName”:”名称”,”price”:100,”count”:100},{...}]
     *
     * @return goods_kind - 商品规格，JSON格式
[{“kindName”:”名称”,”price”:100,”count”:100},{...}]
     */
    public String getGoodsKind() {
        return goodsKind;
    }

    /**
     * 设置商品规格，JSON格式
[{“kindName”:”名称”,”price”:100,”count”:100},{...}]
     *
     * @param goodsKind 商品规格，JSON格式
[{“kindName”:”名称”,”price”:100,”count”:100},{...}]
     */
    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind;
    }

    /**
     * 获取价格范围
     *
     * @return price - 价格范围
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格范围
     *
     * @param price 价格范围
     */
    public void setPrice(String price) {
       this.price = price;
    }

    /**
     * 获取是否上架，0未上架，1已上架，默认1
     *
     * @return is_release - 是否上架，0未上架，1已上架，默认1
     */
    public String getIsRelease() {
        return isRelease;
    }

    /**
     * 设置是否上架，0未上架，1已上架，默认1
     *
     * @param isRelease 是否上架，0未上架，1已上架，默认1
     */
    public void setIsRelease(String isRelease) {
        this.isRelease = isRelease;
    }

    /**
     * 获取发布时间
     *
     * @return release_date - 发布时间
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置发布时间
     *
     * @param releaseDate 发布时间
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 获取运费，0为包邮
     *
     * @return freight - 运费，0为包邮
     */
    public Double getFreight() {
        return freight;
    }

    /**
     * 设置运费，0为包邮
     *
     * @param freight 运费，0为包邮
     */
    public void setFreight(Double freight) {
        this.freight = freight;
    }

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
     * 获取商品地址
     *
     * @return address - 商品地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置商品地址
     *
     * @param address 商品地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取状态，默认1, 0无效 1有效
     *
     * @return status - 状态，默认1, 0无效 1有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，默认1, 0无效 1有效
     *
     * @param status 状态，默认1, 0无效 1有效
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

    /**
     * 获取商品描述
     *
     * @return goods_desc - 商品描述
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * 设置商品描述
     *
     * @param goodsDesc 商品描述
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public List<GoodsPhoto> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<GoodsPhoto> photoList) {
        this.photoList = photoList;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<GoodsKind> getKindList() {
        if(StringUtils.isNotEmpty(this.goodsKind)){
            kindList = JSONArray.parseArray(this.goodsKind,GoodsKind.class);
        }
        return kindList;
    }

    public void setKindList(List<GoodsKind> kindList) {
        this.kindList = kindList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public static Goods parseJson(JSONObject jsonObject){
        Goods goods = new Goods();
        goods.setGoodsName(jsonObject.getString("goodsName"));
        goods.setGoodsDesc(jsonObject.getString("goodsDesc"));
        goods.setAddress(jsonObject.getString("address"));
        goods.setReleaseDate(new Date());
        goods.setGoodsKind(jsonObject.getJSONArray("goodsKind").toJSONString());
        goods.setPrice(getPriceScope(goods.getGoodsKind()));
        return goods;
    }

    private static String getPriceScope(String goodsKind){
        if(StringUtils.isNotEmpty(goodsKind)){
            JSONArray kindArr = JSONArray.parseArray(goodsKind);
            String key = "price";
            Double maxPrice = JsonUtil.getMaxValue(kindArr,key);
            Double minPrice = JsonUtil.getMinValue(kindArr,key);
            if(maxPrice == minPrice){
                return maxPrice.toString();
            }else {
                return  String.format("%s%s%s",minPrice, "-", maxPrice);
            }
        }else {
            return "";
        }
    }
}