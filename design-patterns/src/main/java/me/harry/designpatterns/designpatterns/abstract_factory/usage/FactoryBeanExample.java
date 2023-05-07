package me.harry.designpatterns.designpatterns.abstract_factory.usage;

import me.harry.designpatterns.designpatterns.factory.after.Ship;
import me.harry.designpatterns.designpatterns.factory.usage.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteship = applicationContext.getBean("whiteship-abstract", Ship.class);
        System.out.println(whiteship.getName());*/

        ApplicationContext appFactory = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        ShipFactory shipFactory = appFactory.getBean(ShipFactory.class);
        System.out.println(shipFactory);

        Ship bean = appFactory.getBean(Ship.class);
        System.out.println(bean);
    }
}
