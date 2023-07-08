package com.uc.account.service.keycloak.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeycloakLoginRequest {
    private String grant_type;
    private String client_id;
    private String username;
    private String password;
}
