package com.training.etiya;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringRunner {

    public static void main(final String[] args) {
        ConfigurableApplicationContext runLoc = SpringApplication.run(SpringProjectApplication.class,
                                                                      args);
        //        SpringProjectApplication beanLoc = runLoc.getBean(SpringProjectApplication.class);
        //        System.out.println(beanLoc.person);
        //        SpringProjectApplication applicationLoc = new SpringProjectApplication();
        //        System.out.println(applicationLoc.person);
    }
}
