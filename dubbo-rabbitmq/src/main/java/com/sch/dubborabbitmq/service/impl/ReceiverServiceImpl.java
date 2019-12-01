package com.sch.dubborabbitmq.service.impl;

import com.sch.dubborabbitmq.service.ReceiverService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息接收者
 * @Author: SCH
 * @Date: 2019/12/1 19:46
 */
@Service
public class ReceiverServiceImpl implements ReceiverService {
    /**
     * @param msg 接收的消息
     */
    @Override
    @RabbitListener(queues = "RabbitMq Demo")
    public void process(Object msg) {
        System.out.println(msg);
    }
}
