package com.atguigu.gmall.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.user.UserEntity;
import com.atguigu.gmall.dao.user.UserMapper;
import com.atguigu.gmall.service.user.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: UserServiceImpl
 * 类 定 义:
 * 开发时间: 2020/03/15  22:40
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Service
@Component
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {
}
