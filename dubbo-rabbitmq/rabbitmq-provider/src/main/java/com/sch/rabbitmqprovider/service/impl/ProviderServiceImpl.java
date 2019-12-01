package com.sch.rabbitmqprovider.service.impl;

import com.sch.rabbitmqprovider.service.ProviderService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息发送者
 * @Author: SCH
 * @Date: 2019/12/1 22:32
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private RabbitTemplate template;
    @Value("${mq.config.exchange}")
    private String exChange;
    @Value("${mq.config.info.key}")
    private String infoKey;
    @Value("${mq.config.error.key}")
    private String errorKey;

    @Override
    public void send(String msg) {
        template.convertAndSend(exChange, infoKey, "Info " + msg);
        template.convertAndSend(exChange, errorKey, "Error " + msg);
    }
}
