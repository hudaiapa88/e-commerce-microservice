package com.uc.account.core.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringDocConfig {
    @Value("${gateway.base.path}")
    private String gatewayPath;
    @Bean
    public OpenAPI openAPI(ServletContext servletContext) {
        Server gateway = new Server().url(gatewayPath).description("gateway base url");
        return new OpenAPI()
                .servers(List.of(gateway));
    }
}
