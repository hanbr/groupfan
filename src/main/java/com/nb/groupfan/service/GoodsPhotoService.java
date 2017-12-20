package com.nb.groupfan.service;

import com.nb.groupfan.dao.GoodsPhotoDao;
import com.nb.groupfan.entity.GoodsPhoto;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hanbr on 2017/12/19.
 */
@Service
public class GoodsPhotoService extends BaseService<GoodsPhoto> {

    @Autowired
    private GoodsPhotoDao goodsPhotoDao;

    public List<GoodsPhoto> queryByGoodsId(Long goodsId){
        return goodsPhotoDao.queryByGoodsId(goodsId);
    }

}
