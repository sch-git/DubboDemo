package com.sch.topicprovider;

import com.sch.topicprovider.service.ProviderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: topic交换器测试
 * @Author: SCH
 * @Date: 2019/12/2 18:02
 */
@SpringBootTest
public class TopicTest {
    @Autowired
    private ProviderService providerService;

    @Test
    void contextLoads() {
        providerService.sendUser("provider send msg user");
        providerService.sendOrder("provider send msg order");
        providerService.sendProduct("provider send msg product");
    }
}
