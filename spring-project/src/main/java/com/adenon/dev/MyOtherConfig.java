package com.adenon.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyOtherConfig {

    @Bean
    public MyOtherBean myOtherBean() {
        return new MyOtherBean();
    }

}
