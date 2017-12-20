package com.nb.groupfan.controller;

import com.nb.groupfan.common.*;
import com.nb.groupfan.entity.UserCollect;
import com.nb.groupfan.service.UserCollectService;
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
@RequestMapping(Const.BASE_URL + "/user/collect")
public class UserCollectController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserCollectService userCollectService;

    @PostMapping
    public Result add(UserCollect userCollect) {
        userCollectService.save(userCollect);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@PathVariable Long id) {
        userCollectService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserCollect userCollect) {
        userCollectService.update(userCollect);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        UserCollect userCollect = userCollectService.queryById(id);
        return ResultGenerator.genSuccessResult(userCollect);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserCollect> list = userCollectService.queryAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
