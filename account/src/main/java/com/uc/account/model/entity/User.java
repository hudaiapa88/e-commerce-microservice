package com.uc.account.model.entity;

import com.uc.account.model.entity.base.AuditData;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
public class User extends AuditData {
    private String firstname;
    private String lastname;
    private String password;
    @Indexed(unique = true)
    private String phone;
    @Indexed(unique = true)
    private String email;
    private Address address;
}
