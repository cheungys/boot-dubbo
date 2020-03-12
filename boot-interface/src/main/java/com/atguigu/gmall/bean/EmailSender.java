package com.atguigu.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: EmailSender
 * 类 定 义:
 * 开发时间: 2020/03/12  23:35
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Data
public class EmailSender implements Serializable {
    private String id;
    /**
     * 发件用户ID
     */
    private String userId;
    /**
     * 发件人
     */
    private String fromUser;
    /**
     * 收件人
     */
    private String toUsers;
    /**
     * 抄送人
     */
    private String ccUsers;
    /**
     * 主题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 附件列表
     */
    private List<EmailFile> files;
    /**
     * 收件时间
     */
    private Date sendDate;
    /**
     * 删除标识
     */
    private String delTag;
    /**
     * 开始时间
     */
    private String beginTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 附件路径
     */
    private List<String> filepath;
}
