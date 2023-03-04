package com.uc.account.model.entity;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@TypeAlias("customer")
@Data
public class Customer extends User{
}
