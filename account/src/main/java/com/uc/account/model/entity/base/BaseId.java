package com.uc.account.model.entity.base;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
public class BaseId {
    @Id
    private String id ;
}
