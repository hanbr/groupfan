package com.nb.groupfan.controller;

import com.nb.groupfan.common.*;
import com.nb.groupfan.entity.GoodsPhoto;
import com.nb.groupfan.service.GoodsPhotoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by hanbr on 2017/12/19.
*/
@RestController
@RequestMapping(Const.BASE_URL + "/goods/photo")
public class GoodsPhotoController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private GoodsPhotoService goodsPhotoService;

    @PostMapping
    public Result add(GoodsPhoto goodsPhoto) {
        goodsPhotoService.save(goodsPhoto);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@PathVariable Long id) {
        goodsPhotoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(GoodsPhoto goodsPhoto) {
        goodsPhotoService.update(goodsPhoto);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        GoodsPhoto goodsPhoto = goodsPhotoService.queryById(id);
        return ResultGenerator.genSuccessResult(goodsPhoto);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsPhoto> list = goodsPhotoService.queryAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
