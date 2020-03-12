package com.atguigu.gmall.service.impl.email;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.EmailSender;
import com.atguigu.gmall.service.email.SendEmailService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: SendEmailServiceImpl
 * 类 定 义:
 * 开发时间: 2020/03/12  23:38
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Service
@Component
public class SendEmailServiceImpl implements SendEmailService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendEmail(EmailSender emailSender) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(emailSender.getId());
        rabbitTemplate.convertAndSend("mail-exchange", "mail.test", emailSender, correlationData);
    }
}
