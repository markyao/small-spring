package cn.mark.springframework.beans.factory;

import cn.mark.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
