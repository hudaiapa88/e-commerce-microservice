package com.uc.account.model.dto.response;

import com.uc.account.model.dto.base.AuditDataDto;
import com.uc.account.model.entity.Address;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
public class CustomerResponse extends AuditDataDto {
    private String firstname;
    private String lastname;
    private String password;
    @Indexed(unique = true)
    private String phone;
    @Indexed(unique = true)
    private String email;
    private Address address;
}
