package cn.mark.springframework.test;

import cn.mark.springframework.beans.factory.config.BeanDefinition;
import cn.mark.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.mark.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        //1. 初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();

    }
}
