package com.uc.account.manager;

import com.uc.account.core.keyclock.KeycloakConfigProperties;
import com.uc.account.core.keyclock.KeycloakUser;
import lombok.RequiredArgsConstructor;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class KeycloakManager {
    private final Keycloak keycloak;
    private final KeycloakConfigProperties keycloakConfigProperties;
    public void saveUser(KeycloakUser user){
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setEmail(user.getEmail());
        userRepresentation.setUsername(user.getUsername());
        userRepresentation.setEnabled(true);
        userRepresentation.setEmailVerified(true);
        CredentialRepresentation userCredentialRepresentation = new CredentialRepresentation();
        userCredentialRepresentation.setType(CredentialRepresentation.PASSWORD);
        userCredentialRepresentation.setTemporary(false);
        userCredentialRepresentation.setValue(user.getPassword());
        userRepresentation.setRealmRoles(Arrays.asList("USER"));
        userRepresentation.setCredentials(Arrays.asList(userCredentialRepresentation));
        keycloak.realm(keycloakConfigProperties.getApplicationRealm()).users().create(userRepresentation);

/*        if (user.isAdmin()) {
            userRepresentation =
                    keycloak.realm(keycloakConfigProperties.getApplicationRealm()).users().search(user.getUsername()).get(0);
            UserResource userResource =
                    keycloak.realm(keycloakConfigProperties.getApplicationRealm()).users().get(userRepresentation.getId());
            List<RoleRepresentation> rolesToAdd =
                    Arrays.asList(keycloak.realm(keycloakConfigProperties.getApplicationRealm()).roles().get("admin").toRepresentation());
            userResource.roles().realmLevel().add(rolesToAdd);
        }*/
    }
}
