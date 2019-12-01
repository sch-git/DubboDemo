package com.sch.rabbitmqprovider.service;

/**
 * @Description: 消息发送者
 * @Author: SCH
 * @Date: 2019/12/1 22:31
 */
public interface ProviderService {
    void send(String msg);
}
