package com.sch.dubborabbitmq;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootTest
class DubboRabbitmqApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void publicTest() throws IOException, TimeoutException {
        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(AMQP.PROTOCOL.PORT);
        factory.setUsername("sch");
        factory.setPassword("123456");
        // 建立一个长链接
        Connection connection = factory.newConnection();
        // 新建一个通道
        Channel channel = connection.createChannel();
        // 声明一个队列
        String QUEUE_NAME = "rabbitMq_Demo";
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 发送消息
        String message = "hello world";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        System.out.println("Producer Send a Message: " + message);
        // 关闭资源
        channel.close();
        connection.close();
    }

}
