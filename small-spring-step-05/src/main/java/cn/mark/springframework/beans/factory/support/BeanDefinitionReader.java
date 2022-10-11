package cn.mark.springframework.beans.factory.support;

import cn.mark.springframework.beans.BeansException;
import cn.mark.springframework.core.io.Resource;
import cn.mark.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
