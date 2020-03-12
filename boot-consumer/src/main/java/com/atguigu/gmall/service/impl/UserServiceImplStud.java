package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: UserServiceImplStud
 * 类 定 义:
 * 开发时间: 2020/02/01  1:17
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */

public class UserServiceImplStud implements UserService {
    private final UserService userService;

    public UserServiceImplStud(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        if (!StringUtils.isEmpty(userId)){
           return  userService.getUserAddressList(userId);

        }
        return null;

    }
}
