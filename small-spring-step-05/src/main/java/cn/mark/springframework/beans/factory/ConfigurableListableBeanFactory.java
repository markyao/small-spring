package cn.mark.springframework.beans.factory;

import cn.mark.springframework.beans.BeansException;
import cn.mark.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.mark.springframework.beans.factory.config.BeanDefinition;
import cn.mark.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, ConfigurableBeanFactory, AutowireCapableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
