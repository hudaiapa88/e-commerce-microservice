package com.uc.payment.model.entity.base;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
public class AuditData extends BaseEntity{
    @CreatedDate
    private LocalDateTime createdDate=LocalDateTime.now();

    @LastModifiedDate
    private LocalDateTime lastModifiedDate =LocalDateTime.now();
}
