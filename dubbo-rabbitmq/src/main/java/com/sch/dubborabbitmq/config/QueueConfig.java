package com.sch.dubborabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 创建消息队列
 * @Author: SCH
 * @Date: 2019/12/1 19:37
 */
@Configuration
public class QueueConfig {
    @Bean
    public Queue CreateQueue() {
        return new Queue("RabbitMq Demo");
    }
}
