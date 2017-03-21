package com.tsinghua.spring.beanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("3������BeanPostProcessorʵ���๹��������");
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        System.out
        .println("16��BeanPostProcessor�ӿڷ���postProcessAfterInitialization�����Խ��и��ģ�");
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
    	Person p = (Person) arg0;
    	p.setAddress("tsinghua");
        System.out
        .println("13��BeanPostProcessor�ӿڷ���postProcessBeforeInitialization�����Խ��и��ģ�");
        return arg0;
    }
}