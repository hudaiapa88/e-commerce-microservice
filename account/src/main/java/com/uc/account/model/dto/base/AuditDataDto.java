package com.uc.account.model.dto.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuditDataDto extends BaseDto{
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
