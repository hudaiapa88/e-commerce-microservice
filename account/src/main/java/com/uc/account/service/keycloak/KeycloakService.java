package com.uc.account.service.keycloak;

import com.uc.account.manager.LoginResponse;
import com.uc.account.service.keycloak.dto.KeycloakLoginRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "localhost:8080", name = "keycloak")
public interface KeycloakService {
    @RequestMapping(value = "/realms/ecommerce/protocol/openid-connect/token",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,method = RequestMethod.POST)
    LoginResponse login(@RequestBody KeycloakLoginRequest keycloakLoginRequest);
}
