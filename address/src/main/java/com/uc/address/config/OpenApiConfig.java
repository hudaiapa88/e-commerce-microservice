package com.uc.address.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info =
@Info(title = "Address API", version = "1.0", description = "Documentation Address API v1.0")
)
public class OpenApiConfig {
}
