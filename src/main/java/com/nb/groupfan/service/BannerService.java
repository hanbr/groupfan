package com.nb.groupfan.service;

import com.nb.groupfan.dao.BannerDao;
import com.nb.groupfan.entity.Banner;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hanbr on 2017/12/19.
 */
@Service
public class BannerService extends BaseService<Banner> {
    @Autowired
    BannerDao bannerDao;

    public List<Banner> getBannerIndexList(int count){
        return  bannerDao.getBannerIndexList(count);
    }
}
