package com.uc.payment.model.entity.base;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
public class BaseEntity {
    @Id
    private String id = UUID.randomUUID().toString();
}
