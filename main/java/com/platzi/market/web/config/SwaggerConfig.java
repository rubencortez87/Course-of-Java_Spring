package com.platzi.market.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.platzi.market.web.controller"))
                .build();
    }
}
