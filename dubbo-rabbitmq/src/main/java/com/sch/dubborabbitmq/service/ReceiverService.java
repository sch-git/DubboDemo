package com.sch.dubborabbitmq.service;

/**
 * @Description: 消息接收者
 * @Author: SCH
 * @Date: 2019/12/1 19:45
 */
public interface ReceiverService {
    void process(Object msg);
}
