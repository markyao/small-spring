package cn.mark.springframework.beans.factory.support;

import cn.mark.springframework.beans.BeansException;
import cn.mark.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition bd, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
