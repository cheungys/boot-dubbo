package com.atguigu.gmall.service.impl.message;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.Message;
import com.atguigu.gmall.service.message.SendMessageService;
import com.zhenzi.sms.ZhenziSmsClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zys
 * 系统名称:
 * 模块名称:
 * 类 名 称: SendMessageServiceImpl
 * 类 定 义:
 * 开发时间: 2020/03/12  22:38
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@Service
@Component
public class SendMessageServiceImpl implements SendMessageService {

    private static final Logger logger = LoggerFactory.getLogger(SendMessageServiceImpl.class);

    /**
     * 服务请求地址（仅供个人开发或学习用，详情请看说明文档）
     */
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    /**
     * 应用id ，可通过用户中心，应用详情查看
     */
    private String appId = "102453";
    /**
     * 应用密钥
     */
    private String appSecret = "f90a124c-f416-4281-9db5-63993c9cef2e";
    ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
    /**
     * 发送成功标识
     */
    private static final String SEND_SUCCESS_FLAG = "0";
    private static final String CODE = "code";

    @Override
    public boolean sendMessage(Message message) {
        try {
            String  result = client.send(message.getReceives(), message.getContent());
            System.out.println("接口返回结果为========"+result);
        }catch (Exception e){
            logger.error(e.getMessage());
        }

        return true;
    }

    @Override
    public List<Message> getMessageRecords(Message message) {
        return null;
    }

    @Override
    public boolean saveMessage(Message message) {
        return false;
    }
}
