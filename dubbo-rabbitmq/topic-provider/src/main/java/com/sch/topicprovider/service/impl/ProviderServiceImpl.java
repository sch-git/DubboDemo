package com.sch.topicprovider.service.impl;

import com.sch.topicprovider.service.ProviderService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息发送者
 * @Author: SCH
 * @Date: 2019/12/2 14:02
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private RabbitTemplate template;
    @Value("${mq.config.exchange}")
    private String exchange;

    @Override
    public void sendUser(String msg) {
        template.convertAndSend(exchange, "user.info", "USER-INFO:" + msg);
        template.convertAndSend(exchange, "user.debug", "USER-DEBUG:" + msg);
        template.convertAndSend(exchange, "user.error", "USER-ERROR:" + msg);
    }

    @Override
    public void sendProduct(String msg) {
        template.convertAndSend(exchange, "product.info", "PRODUCT-INFO:" + msg);
        template.convertAndSend(exchange, "product.debug", "PRODUCT-DEBUG:" + msg);
        template.convertAndSend(exchange, "product.error", "PRODUCT-ERROR:" + msg);
    }

    @Override
    public void sendOrder(String msg) {
        template.convertAndSend(exchange, "order.info", "ORDER-INFO:" + msg);
        template.convertAndSend(exchange, "order.debug", "ORDER-DEBUG:" + msg);
        template.convertAndSend(exchange, "order.error", "ORDER-ERROR:" + msg);
    }
}
