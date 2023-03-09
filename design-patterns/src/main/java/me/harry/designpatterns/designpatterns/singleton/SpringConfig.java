package me.harry.designpatterns.designpatterns.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String test() {
        return "test";
    }
}
