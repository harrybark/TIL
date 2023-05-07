package me.harry.designpatterns.designpatterns.abstract_factory.usage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory hello() {
        return new ShipFactory();
    }
}
