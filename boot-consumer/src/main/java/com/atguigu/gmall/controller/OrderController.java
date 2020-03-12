package com.atguigu.gmall.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: OrderController
 * 类 定 义:
 * 开发时间: 2020/01/30  11:04
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid") String uid) {
        List<UserAddress> userAddresses = orderService.initOrder(uid);
        return userAddresses;
    }
}
