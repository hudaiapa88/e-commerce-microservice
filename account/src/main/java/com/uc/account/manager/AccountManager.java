package com.uc.account.manager;

import com.uc.account.core.keyclock.KeycloakUser;
import com.uc.account.model.dto.request.LoginRequest;
import com.uc.account.model.dto.request.SaveUserRequest;
import com.uc.account.model.dto.response.UserResponse;
import com.uc.account.model.enums.Role;
import com.uc.account.service.keycloak.KeycloakService;
import com.uc.account.service.keycloak.dto.KeycloakLoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountManager {
    private final KeycloakManager keycloakManager;
    private final KeycloakService keycloakService;
    public UserResponse getById(String id) {
        return null;
    }

    public UserResponse save(SaveUserRequest saveUserRequest) {
        keycloakManager.saveUser(KeycloakUser.builder()
                        .email(saveUserRequest.getEmail())
                        .username(saveUserRequest.getEmail())
                        .password(saveUserRequest.getPassword())
                        .role(Role.USER)
                .build());
        UserResponse userResponse= new UserResponse();
        userResponse.setFirstname(saveUserRequest.getFirstname());
        userResponse.setLastname(saveUserRequest.getLastname());
        userResponse.setEmail(saveUserRequest.getEmail());
        userResponse.setPhone(saveUserRequest.getPhone());
        userResponse.setAddress(saveUserRequest.getAddress());
        return userResponse;
    }

    public LoginResponse login(LoginRequest loginRequest) {
        KeycloakLoginRequest keycloakLoginRequest= new KeycloakLoginRequest();
        keycloakLoginRequest.setUsername(loginRequest.getUsername());
        keycloakLoginRequest.setPassword(loginRequest.getPassword());
        keycloakLoginRequest.setClient_id("ecommerce-client");
        keycloakLoginRequest.setGrant_type("password");
        return keycloakService.login(keycloakLoginRequest);

    }
}
