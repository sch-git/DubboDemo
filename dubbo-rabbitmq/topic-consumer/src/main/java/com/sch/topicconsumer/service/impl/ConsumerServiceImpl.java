package com.sch.topicconsumer.service.impl;

import com.sch.topicconsumer.service.ConsumerService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息接收者
 * @Author: SCH
 * @Date: 2019/12/2 17:53
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "${mq.config.info.name}"),
                    exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
                    key = "*.info"
            )
    )
    public void infoProcess(String msg) {
        System.out.println("infoProcess:" + msg);
    }

    @Override
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "${mq.config.error.name}"),
                    exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
                    key = "*.error"
            )
    )
    public void errorProcess(String msg) {
        System.out.println("errorProcess:" + msg);
    }

    @Override
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "${mq.config.log.name}"),
                    exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
                    key = "*.*"
            )
    )
    public void logProcess(String msg) {
        System.out.println("logProcess:" + msg);
    }
}
