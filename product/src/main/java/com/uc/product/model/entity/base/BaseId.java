package com.uc.product.model.entity.base;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
public class BaseId {
    @Id
    private String id = UUID.randomUUID().toString();
}
