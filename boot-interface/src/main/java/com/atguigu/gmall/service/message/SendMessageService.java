package com.atguigu.gmall.service.message;


import com.atguigu.gmall.bean.Message;

import java.util.List;

/**
 * @author zys
 */
public interface SendMessageService {

    /**
     * 发送个人短信
     *
     * @param message
     * @return
     */
    boolean sendMessage(Message message);

    /**
     * 查询发送记录
     *
     * @param message
     * @return
     */
    List<Message> getMessageRecords(Message message);

    /**
     * 保存短信记录
     * @param message
     * @return
     */
    boolean saveMessage(Message message);
}
