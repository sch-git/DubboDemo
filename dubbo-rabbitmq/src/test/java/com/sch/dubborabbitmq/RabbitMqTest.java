package com.sch.dubborabbitmq;

import com.sch.dubborabbitmq.service.ProviderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 消息队列测试
 * @Author: SCH
 * @Date: 2019/12/1 19:49
 */
@SpringBootTest
public class RabbitMqTest {
    @Autowired
    private ProviderService providerService;

    @Test
    public void MqTest() {
        providerService.send("Hello World!");
    }
}
