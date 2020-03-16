package com.atguigu.gmall;

import com.atguigu.gmall.bean.user.UserEntity;
import com.atguigu.gmall.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootProviderApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void getUserList() {
        try {
            List<UserEntity> userEntityList = userService.list();
            if (!userEntityList.isEmpty()) {
                System.out.println("查询结果如下：");
                for (UserEntity userEntity : userEntityList) {
                    System.out.println(userEntity.toString());
                }
            } else {
                System.out.println("空的查询无结果");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常报错了");
        }

    }

}
