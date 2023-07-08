package com.uc.account.model.dto.response;

import com.uc.account.model.entity.Address;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private String firstname;
    private String lastname;
    private String password;
    private String phone;
    private String email;
    private Address address;
}
