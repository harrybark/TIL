package me.harry.designpatterns.designpatterns.factory.usage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {

    public static void main(String[] args) {
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory appFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = xmlFactory.getBean("hello", String.class);
        System.out.println(hi);
    }
}
