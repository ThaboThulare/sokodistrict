package com.thabo.sokodistrict;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import com.wordnik.swagger.model.ApiInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger
public class SwaggerConfig
{

    @Autowired
    private SpringSwaggerConfig springSwaggerConfig;

    @Bean
    public SwaggerSpringMvcPlugin customImplementation()
    {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(
                apiInfo()).includePatterns("/.*");
    }

    private ApiInfo apiInfo()
    {
        ApiInfo apiInfo = new ApiInfo("Soko District API", "API for Soko District",
                                      "Soko District API terms of service", "thabothulare68@gmail.com",
                                      "Soko District API Licence Type", "Soko District API License URL");
        return apiInfo;
    }
}
