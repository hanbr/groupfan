package com.nb.groupfan.controller;

import com.nb.groupfan.common.*;
import com.nb.groupfan.entity.UserAddress;
import com.nb.groupfan.service.UserAddressService;
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
@RequestMapping(Const.BASE_URL + "/user/address")
public class UserAddressController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserAddressService userAddressService;

    @PostMapping
    public Result add(UserAddress userAddress) {
        userAddressService.save(userAddress);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@PathVariable Long id) {
        userAddressService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserAddress userAddress) {
        userAddressService.update(userAddress);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        UserAddress userAddress = userAddressService.queryById(id);
        return ResultGenerator.genSuccessResult(userAddress);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserAddress> list = userAddressService.queryAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
