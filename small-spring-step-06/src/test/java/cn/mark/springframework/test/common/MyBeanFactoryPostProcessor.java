package cn.mark.springframework.test.common;

import cn.mark.springframework.beans.BeansException;
import cn.mark.springframework.beans.PropertyValue;
import cn.mark.springframework.beans.PropertyValues;
import cn.mark.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.mark.springframework.beans.factory.config.BeanDefinition;
import cn.mark.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}