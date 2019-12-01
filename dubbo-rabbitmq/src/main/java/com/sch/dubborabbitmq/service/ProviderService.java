package com.sch.dubborabbitmq.service;

/**
 * @Description: 消息发送者
 * @Author: SCH
 * @Date: 2019/12/1 19:33
 */
public interface ProviderService {
    void send(Object msg);
}
