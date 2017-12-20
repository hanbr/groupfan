package com.nb.groupfan.dao;

import com.nb.groupfan.common.BaseDao;
import com.nb.groupfan.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface GoodsDao extends BaseDao<Goods> {

    @Results(id = "goodsMap", value = {
            @Result(column = "goods_id", property = "goodsId", javaType = Long.class),
            @Result(column = "goods_name", property = "goodsName", javaType = String.class),
            @Result(column = "goods_desc", property = "goodsDesc", javaType = String.class),
            @Result(column = "goods_kind", property = "goodsKind", javaType = String.class),
            @Result(column = "price", property = "price", javaType = String.class),
            @Result(column = "address", property = "address", javaType = String.class),
            @Result(column = "user_id", property = "userId", javaType = Long.class),
            @Result(column = "release_date", property = "releaseDate", javaType = Date.class),
            @Result(column = "photo_url" ,property = "cover" , javaType = String.class)
    })

    @Select("SELECT goods_id,goods_name,goods_desc,goods_kind,price,address,user_id,release_date FROM t_goods ORDER BY release_date DESC")
    List<Goods> getGoodsListByGroupId(@Param("groupId") Long groupId);

    @Select("SELECT a.goods_id as goodsId,a.goods_name as goodsName,a.goods_desc as goodsDesc,a.goods_kind as goodsKind,a.price," +
            "a.address,a.user_id as userId,a.release_date as releaseDate,b.photo_url as cover " +
            "FROM t_goods a LEFT JOIN t_goods_photo b ON a.goods_id = b.goods_id AND b.sort = 1 " +
            "where a.is_release=#{isRelease} and a.user_id = #{userId} ORDER BY a.publish_date desc")
    List<Goods> getGoodsListByUser(@Param("userId") Integer userId,@Param("isRelease") boolean isRelease);

}