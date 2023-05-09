package com.uc.address.model.document;

import com.uc.address.model.dto.request.SaveAddressRequest;
import com.uc.address.model.dto.request.UpdateAddressRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Address {
    @Id
    private String id;
    private String country;
    private String province;
    private String district;
    private String neighborhood;
    private String street;
    private String buildingInformation;
    private String fullAddress;
    private Position position;

    public static Address create(SaveAddressRequest saveAddressRequest) {
        Address address= new Address();
        address.setCountry(saveAddressRequest.getCountry());
        address.setProvince(saveAddressRequest.getProvince());
        address.setDistrict(saveAddressRequest.getDistrict());
        address.setNeighborhood(saveAddressRequest.getNeighborhood());
        address.setStreet(saveAddressRequest.getStreet());
        address.setBuildingInformation(saveAddressRequest.getBuildingInformation());
        address.setFullAddress(saveAddressRequest.getFullAddress());
        address.setPosition(saveAddressRequest.getPosition());
        return address;
    }

    public Address update(UpdateAddressRequest updateAddressRequest) {
        this.setCountry(updateAddressRequest.getCountry());
        this.setProvince(updateAddressRequest.getProvince());
        this.setDistrict(updateAddressRequest.getDistrict());
        this.setNeighborhood(updateAddressRequest.getNeighborhood());
        this.setStreet(updateAddressRequest.getStreet());
        this.setBuildingInformation(updateAddressRequest.getBuildingInformation());
        this.setFullAddress(updateAddressRequest.getFullAddress());
        this.setPosition(updateAddressRequest.getPosition());
        return this;
    }
}
