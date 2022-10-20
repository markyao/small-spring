package cn.mark.springframework.test;


import cn.mark.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mark.springframework.test.event.CustomEvent;
import org.junit.jupiter.api.Test;


public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}