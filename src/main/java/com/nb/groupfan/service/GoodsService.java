package com.nb.groupfan.service;

import com.nb.groupfan.dao.GoodsDao;
import com.nb.groupfan.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hanbr on 2017/12/19.
 */
@Service
public class GoodsService extends BaseService<Goods> {

    @Autowired
    GoodsDao goodsDao;

    public List<Goods> getGoodsListByGroupId(Long groupId) {
        return goodsDao.getGoodsListByGroupId(groupId);
    }

    public List<Goods> getGoodsListByUser(Integer userId, boolean isRelease) {
        return goodsDao.getGoodsListByUser(userId, isRelease);
    }

}
