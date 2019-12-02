package com.sch.topicprovider.service;

/**
 * @Description: 消息发送者
 * @Author: SCH
 * @Date: 2019/12/2 14:01
 */
public interface ProviderService {
    void sendUser(String msg);

    void sendProduct(String msg);

    void sendOrder(String msg);
}
