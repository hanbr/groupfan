package com.nb.groupfan.dao;

import com.nb.groupfan.common.BaseDao;
import com.nb.groupfan.entity.GoodsPhoto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsPhotoDao extends BaseDao<GoodsPhoto> {
    @Select("SELECT photo_id,photo_url FROM t_goods_photo WHERE goods_id = #{goodsId} order by sort")
    @Results(id ="goodsPhotoMap",value = {
            @Result(column = "photo_id",property = "photoId",javaType = Long.class),
            @Result(column = "photo_url",property = "photoUrl",javaType = String.class),
            @Result(column = "goods_id",property = "goodsId",javaType = Long.class)
    })
    List<GoodsPhoto> queryByGoodsId(@Param("goodsId") Long goodsId);
}