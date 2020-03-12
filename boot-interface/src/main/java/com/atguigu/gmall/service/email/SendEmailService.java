package com.atguigu.gmall.service.email;

import com.atguigu.gmall.bean.EmailSender;

public interface SendEmailService {
    /**
     * 生产者发送邮件
     * @param emailSender
     */
    void sendEmail(EmailSender emailSender);
}
