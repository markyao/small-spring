package cn.mark.springframework.beans.factory;

import cn.mark.springframework.beans.BeansException;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
