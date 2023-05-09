package com.uc.address.model.mapper;

import com.uc.address.model.document.Address;
import com.uc.address.model.dto.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper extends BaseMapper<Address, AddressResponse>{
}
