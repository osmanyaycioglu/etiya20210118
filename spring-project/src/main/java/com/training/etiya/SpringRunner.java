package com.training.etiya;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringRunner {

    public static void main(final String[] args) {
        ConfigurableApplicationContext runLoc = SpringApplication.run(SpringProjectApplication.class,
                                                                      args);
        //        ObjectMapper mapperLoc = new ObjectMapper();
        //
        //        try {
        //            Person readValueLoc = mapperLoc.readValue(new File("my.json"),
        //                                                      Person.class);
        //        } catch (Exception e) {
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        }
        //        SpringProjectApplication beanLoc = runLoc.getBean(SpringProjectApplication.class);
        //        System.out.println(beanLoc.person);
        //        SpringProjectApplication applicationLoc = new SpringProjectApplication();
        //        System.out.println(applicationLoc.person);
    }
}
