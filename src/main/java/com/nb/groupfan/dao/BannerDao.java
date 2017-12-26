package com.nb.groupfan.dao;

import com.nb.groupfan.common.BaseDao;
import com.nb.groupfan.entity.Banner;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface BannerDao extends BaseDao<Banner> {

    @Results(id = "bannerMap", value = {
            @Result(column = "banner_id", property = "bannerId", javaType = Long.class),
            @Result(column = "image_url", property = "imageUrl", javaType = String.class),
            @Result(column = "image_link", property = "imageLink", javaType = String.class),
            @Result(column = "sort", property = "sort", javaType = Integer.class),
    })

    @Select("SELECT banner_id, image_url,image_link,sort FROM t_banner WHERE STATUS = 1 ORDER BY sort LIMIT #{count}")
    List<Banner> getBannerIndexList(@Param("count") int count);
}