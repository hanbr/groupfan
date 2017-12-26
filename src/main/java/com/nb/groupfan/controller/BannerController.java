package com.nb.groupfan.controller;

import com.nb.groupfan.common.*;
import com.nb.groupfan.entity.Banner;
import com.nb.groupfan.service.BannerService;
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
@RequestMapping(Const.BASE_URL + "/banner")
public class BannerController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BannerService bannerService;

    @PostMapping
    public Result add(Banner banner) {
        bannerService.save(banner);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping
    public Result delete(@PathVariable Long id) {
        bannerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Banner banner) {
        bannerService.update(banner);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@RequestParam Long id) {
        Banner banner = bannerService.queryById(id);
        return ResultGenerator.genSuccessResult(banner);
    }

    @GetMapping
    public Result list(@RequestParam(value = "count",defaultValue = "3") Integer count) {
        List<Banner> list = bannerService.getBannerIndexList(count);
        return ResultGenerator.genSuccessResult(list);
    }
}
