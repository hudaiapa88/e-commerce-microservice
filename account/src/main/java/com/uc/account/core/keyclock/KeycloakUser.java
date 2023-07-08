package com.uc.account.core.keyclock;

import com.uc.account.model.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class KeycloakUser {

    private String username;

    private String password;

    private String email;

    private Role role;
}
