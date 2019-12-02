package com.sch.topicconsumer.service;

/**
 * @Description: 消息接收者
 * @Author: SCH
 * @Date: 2019/12/2 17:52
 */
public interface ConsumerService {
    void infoProcess(String msg);

    void errorProcess(String msg);

    void logProcess(String msg);
}
