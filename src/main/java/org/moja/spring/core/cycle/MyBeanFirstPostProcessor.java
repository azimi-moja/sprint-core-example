package org.moja.spring.core.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanFirstPostProcessor implements BeanPostProcessor, Ordered {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanFirstPostProcessor.postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanFirstPostProcessor.postProcessAfterInitialization");
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
