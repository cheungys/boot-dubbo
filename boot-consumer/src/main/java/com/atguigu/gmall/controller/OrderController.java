package com.atguigu.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.EmailSender;
import com.atguigu.gmall.bean.Message;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.user.UserEntity;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.email.SendEmailService;
import com.atguigu.gmall.service.message.SendMessageService;
import com.atguigu.gmall.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private OrderService orderService;
    @Reference
    SendMessageService sendMessageService;
    @Reference
    SendEmailService sendEmailService;
    @Reference
    UserService userService;

    @RequestMapping("initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid") String uid) {
        List<UserAddress> userAddresses = orderService.initOrder(uid);
        return userAddresses;
    }

    @RequestMapping("send")
    @ResponseBody
    public String send() {
        System.out.println("进来了");
        Message message = new Message();
        message.setContent("78t9re");
        message.setReceives("15626183846");
        boolean resu = sendMessageService.sendMessage(message);
        logger.info("远程调用结果" + resu);
        if (resu) {
            return "66666666666666666";
        }
        return "失败了";
    }

    @RequestMapping("sendEmail")
    @ResponseBody
    public String sendEmail() {
        EmailSender emailSend = new EmailSender();
        emailSend.setId("111");
        emailSend.setContent("最后终结者 测试内容");
        emailSend.setTitle("最终测主题");
        emailSend.setToUsers("15626183846@163.com");

        sendEmailService.sendEmail(emailSend);
        return "66666";
    }

    @RequestMapping("getUser")
    @ResponseBody
    public List<UserEntity> getUser() {
        List<UserEntity> userEntityList = userService.list();
        if (!userEntityList.isEmpty()) {
            System.out.println("查询结果如下：");
            for (UserEntity userEntity : userEntityList) {
                System.out.println(userEntity.toString());
            }
        } else {
            System.out.println("空的查询无结果");
        }
        return userEntityList;
    }
}
