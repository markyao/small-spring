package cn.mark.springframework.beans.factory.support;

import cn.mark.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> stringObjectMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return stringObjectMap.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        stringObjectMap.put(beanName, singletonObject);
    }
}
