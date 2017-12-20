package com.nb.groupfan.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nb.groupfan.common.*;
import com.nb.groupfan.entity.Goods;
import com.nb.groupfan.entity.GoodsPhoto;
import com.nb.groupfan.service.GoodsPhotoService;
import com.nb.groupfan.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanbr on 2017/12/19.
 */
@RestController
@RequestMapping(Const.BASE_URL + "/goods")
public class GoodsController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsPhotoService goodsPhotoService;

    @PostMapping
    public Result add(@RequestBody JSONObject jsonObject) {
        Goods goods = Goods.parseJson(jsonObject);
        goods.setUserId(1L);
        goodsService.save(goods);
        List<GoodsPhoto> photoList = getPhotos(jsonObject, goods.getGoodsId());
        goodsPhotoService.saveList(photoList);
        return ResultGenerator.genSuccessResult();
    }


    private List<GoodsPhoto> getPhotos(JSONObject jsonObject, Long goodsId) {
        JSONArray jsonArray = jsonObject.getJSONArray("imgs");
        List<GoodsPhoto> imgList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            GoodsPhoto goodsPhoto = new GoodsPhoto();
            goodsPhoto.setGoodsId(goodsId);
            goodsPhoto.setSort(i + 1);
            goodsPhoto.setPhotoUrl(jsonArray.getString(i));
            imgList.add(goodsPhoto);
        }
        return imgList;
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        goodsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Goods goods) {
        goodsService.update(goods);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id) {
        Goods goods = goodsService.queryById(id);
        return ResultGenerator.genSuccessResult(goods);
    }

    @GetMapping
    public Result list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> list = goodsService.getGoodsListByGroupId(0L);
        for (Goods goods : list) {
            List<GoodsPhoto> imgList = goodsPhotoService.queryByGoodsId(goods.getGoodsId());
            goods.setPhotoList(imgList);
        }
        return ResultGenerator.genSuccessResult(list);
    }
}
