package com.training.etiya.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.adenon.dev.MyOtherBean;
import com.adenon.dev.MyOtherConfig;

@Configuration
@Profile("dev")
@Import(MyOtherConfig.class)
@PropertySource("classpath:abc.properties")
public class ExecuteConfigDev {

    @Value("${execution.type}")
    private int    execType;

    @Value("${a.c.d}")
    private String acd;

    @Bean
    @Qualifier("ayse")
    public IExecute createExecute(final MyOtherBean myOtherBeanParam) {
        myOtherBeanParam.test();
        System.out.println(this.acd);
        switch (this.execType) {
            case 1:
                return new ExecuteImpl();
            case 2:
                return new ExecuteImpl2();
            case 3:
                return new ExecuteImpl3("osman");
            default:
                return new ExecuteImpl();
        }
    }

}
