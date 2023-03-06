package com.uc.account.model.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Address {
    private String country;
    @NotBlank(message = "İl alanı boş olmaz.")
    private String province;
    @NotBlank(message = "İlçe alanı boş olmaz.")
    private String district;
    private String neighborhood;
    private String street;
    private String buildingInformation;
    private String fullAddress;
}
