package cn.mark.springframework.test;

import cn.mark.springframework.context.support.ClassPathXmlApplicationContext;
import cn.mark.springframework.test.bean.IUserService;

import org.junit.jupiter.api.Test;



public class ApiTest {

    @Test
    public void test_autoProxy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}