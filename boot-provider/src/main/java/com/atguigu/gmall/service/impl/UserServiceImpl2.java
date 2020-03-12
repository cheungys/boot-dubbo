package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Component;

@Service(version = "2.0.0")
@Component
public class UserServiceImpl2 implements UserService{

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("第二个版本....................");
        UserAddress userAddress = new UserAddress(1,"广东省广州市公安局","1","张生","15626183846","Y");
        UserAddress userAddress2 = new UserAddress(2,"广东省公安厅","1","张声","18148748158","Y");
        return Arrays.asList(userAddress,userAddress2);
    }

}
