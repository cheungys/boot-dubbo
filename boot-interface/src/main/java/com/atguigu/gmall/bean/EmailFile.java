package com.atguigu.gmall.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: EmailFile
 * 类 定 义:
 * 开发时间: 2020/03/12  23:35
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Data
public class EmailFile implements Serializable {
    /**
     * 附件id
     */
    private String id;
    /**
     * 附件名称
     */
    private String fileName;
    /**
     * 所关联的邮件id
     */
    private String emailId;
}
