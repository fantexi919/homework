package com.fantasy.config;

import com.fantasy.bean.StarterBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(com.fantasy.config.ConfigMarker.class)
public class StarterBeanAutoConfiguration {

    static {
        System.out.println("StarterBeanAutoConfiguration init....");
    }

    @Bean
    public StarterBean starterBean(){
        return new StarterBean();
    }
}
