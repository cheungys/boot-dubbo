package com.atguigu.gmall.bean.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: UserEntity
 * 类 定 义:
 * 开发时间: 2020/03/15  22:26
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@TableName("t_user")
@Data
public class UserEntity  extends Model<UserEntity> {
    private String id;
    private String userName;
    private String realName;
    private String password;
    private String phone;
    private String email;
    private String address;
    private String identityCard;
    private String cardType;
    private String createTime;
    private String creator;
    private String modifyTime;
    private String modifier;
    private String delFlag;
    private String vCode;
}
