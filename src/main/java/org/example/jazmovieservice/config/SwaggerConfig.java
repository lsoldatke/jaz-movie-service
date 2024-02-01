package org.example.jazmovieservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Movie service REST API")
                .version("0.1")
                .description("This API exposes endpoints to manage movie repository.");

        return new OpenAPI().info(info);
    }
}
