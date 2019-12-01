package com.sch.dubborabbitmq.service.impl;

import com.sch.dubborabbitmq.service.ProviderService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息发送者
 * @Author: SCH
 * @Date: 2019/12/1 19:33
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * @param msg 消息
     */
    public void send(Object msg) {
        String QUEUENAME = "RabbitMq Demo";
        rabbitTemplate.convertAndSend(QUEUENAME, msg);
    }
}
