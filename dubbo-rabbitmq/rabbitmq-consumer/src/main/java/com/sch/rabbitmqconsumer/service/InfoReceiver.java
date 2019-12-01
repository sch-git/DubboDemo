package com.sch.rabbitmqconsumer.service;

/**
 * @Description: 消息接收者
 * @Author: SCH
 * @Date: 2019/12/1 22:14
 */
public interface InfoReceiver {
    void process(String msg);
}
