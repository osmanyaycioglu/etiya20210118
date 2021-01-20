package com.training.etiya.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import com.adenon.dev.MyOtherConfig;

@Configuration
@Profile("live")
@Import(MyOtherConfig.class)
public class ExecuteConfigLive {

    @Value("${execution.type}")
    private int execType;

    @Bean
    @Qualifier("ayse")
    public IExecute createExecute() {
        return new ExecuteImpl3("osman");
    }

}
