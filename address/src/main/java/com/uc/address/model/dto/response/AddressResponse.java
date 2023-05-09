package com.uc.address.model.dto.response;

import com.uc.address.model.document.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResponse {
    private String id;
    private String country;
    private String province;
    private String district;
    private String neighborhood;
    private String street;
    private String buildingInformation;
    private String fullAddress;
    private Position position;
}
