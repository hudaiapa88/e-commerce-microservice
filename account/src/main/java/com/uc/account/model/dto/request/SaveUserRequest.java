package com.uc.account.model.dto.request;

import com.uc.account.model.entity.Address;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
public class SaveUserRequest {
    private String firstname;
    private String lastname;
    private String password;
    private String phone;
    private String email;
    private Address address;
}
