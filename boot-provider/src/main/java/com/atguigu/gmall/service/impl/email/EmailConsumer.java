package com.atguigu.gmall.service.impl.email;

import com.atguigu.gmall.bean.EmailSender;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import java.util.Map;

/**
 * @author zys
 * 系统名称:
 * 模块名称: 邮件服务
 * 类 名 称: EmailConsummer
 * 类 定 义: 邮件消费者
 * 开发时间: 2020/03/11  23:07
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Component
public class EmailConsumer {
    private final Logger logger = LoggerFactory.getLogger(EmailConsumer.class);

    @Autowired
    private EmailProvider emailProvider;

    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "email", durable = "true"), exchange = @Exchange(value = "mail-exchange", durable = "true", type = "topic"), key = "mail.*"))
    @RabbitHandler
    public void onMailMessage(@Payload EmailSender emailSend, @Headers Map<String, Object> headers, Channel channel) throws Exception {
        logger.info("******收到邮件消息**********");
        emailProvider.sendAttachmentsMail(emailSend.getToUsers(), emailSend.getTitle(), emailSend.getContent(), emailSend.getFilepath());
        Long d = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
        channel.basicAck(d, false);


    }
}
