package com.uc.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
public class ResourceServerSecurityConfig {


    @Bean
    public SecurityWebFilterChain configureResourceServer(ServerHttpSecurity httpSecurity) throws Exception {

        httpSecurity
                .authorizeExchange((authorizeExchangeSpec) -> authorizeExchangeSpec
                        .pathMatchers("/actuator/health/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/swagger-ui.html/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/webjars/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/swagger-resources/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/v3/api-docs/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/address/v3/api-docs/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/account/v3/api-docs/**").permitAll()
                        .pathMatchers(HttpMethod.POST, "/account/login").permitAll()
                        .pathMatchers(HttpMethod.POST, "/account").permitAll()
                        .pathMatchers(HttpMethod.POST, "http://localhost:8080/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "http://localhost:8080/**").permitAll()
                        .pathMatchers(HttpMethod.PUT, "http://localhost:8080/**").permitAll()
                        .anyExchange().authenticated()
                ).oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(withDefaults())
                );

      return  httpSecurity.csrf((csrfSpec)->csrfSpec.disable()).build();
    }
}
