package com.resttechsolutions.contactapi2.config;

import org.apache.catalina.connector.Response;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Response response(){
        return new Response();
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
