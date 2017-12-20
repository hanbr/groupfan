package com.nb.groupfan.controller;

import com.nb.groupfan.common.*;
import com.nb.groupfan.entity.Wechagroup;
import com.nb.groupfan.service.WechagroupService;
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
@RequestMapping(Const.BASE_URL + "/wechagroup")
public class WechagroupController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private WechagroupService wechagroupService;

    @PostMapping
    public Result add(Wechagroup wechagroup) {
        wechagroupService.save(wechagroup);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@PathVariable Long id) {
        wechagroupService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Wechagroup wechagroup) {
        wechagroupService.update(wechagroup);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        Wechagroup wechagroup = wechagroupService.queryById(id);
        return ResultGenerator.genSuccessResult(wechagroup);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Wechagroup> list = wechagroupService.queryAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
