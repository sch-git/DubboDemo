package com.sch.rabbitmqconsumer.service.impl;

import com.sch.rabbitmqconsumer.service.ErrorReceiver;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息接收者
 * @Author: SCH
 * @Date: 2019/12/1 22:14
 */
@Service
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.error.name}", autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.DIRECT),
                key = "${mq.config.error.key}"
        )
)
public class ErrorReceiverImpl implements ErrorReceiver {
    @Override
    @RabbitHandler
    public void process(String msg) {
        System.out.println("receiver error: " + msg);
    }
}
