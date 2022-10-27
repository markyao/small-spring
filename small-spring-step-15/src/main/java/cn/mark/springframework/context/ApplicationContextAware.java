package cn.mark.springframework.context;

import cn.mark.springframework.beans.BeansException;
import cn.mark.springframework.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
