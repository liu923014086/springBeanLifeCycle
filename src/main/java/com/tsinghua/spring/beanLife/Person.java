package com.tsinghua.spring.beanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author qsk
 */
public class Person implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    private String name;
    private String address;
    private int phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        System.out.println("6����������������Person�Ĺ�����ʵ����");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("9����ע�����ԡ�ע������name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("8����ע�����ԡ�ע������address");
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        System.out.println("10����ע�����ԡ�ע������phone");
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone="
                + phone + "]";
    }

    // ����BeanFactoryAware�ӿڷ���
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out
                .println("12����BeanFactoryAware�ӿڡ�����BeanFactoryAware.setBeanFactory()");
        this.beanFactory = arg0;
    }

    // ����BeanNameAware�ӿڷ���
    @Override
    public void setBeanName(String arg0) {
        System.out.println("11����BeanNameAware�ӿڡ�����BeanNameAware.setBeanName()");
        this.beanName = arg0;
    }

    // ����InitializingBean�ӿڷ���
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out
                .println("14����InitializingBean�ӿڡ�����InitializingBean.afterPropertiesSet()");
    }

    // ����DiposibleBean�ӿڷ���
    @Override
    public void destroy() throws Exception {
        System.out.println("��DiposibleBean�ӿڡ�����DiposibleBean.destory()");
    }

    // ͨ��<bean>��init-method����ָ���ĳ�ʼ������
    public void myInit() {
        System.out.println("15����init-method������<bean>��init-method����ָ���ĳ�ʼ������");
    }

    // ͨ��<bean>��destroy-method����ָ���ĳ�ʼ������
    public void myDestory() {
        System.out.println("��destroy-method������<bean>��destroy-method����ָ���ĳ�ʼ������");
    }
}