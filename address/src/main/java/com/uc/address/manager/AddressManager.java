package com.uc.address.manager;

import com.uc.address.exception.EntityNotFoundException;
import com.uc.address.model.document.Address;
import com.uc.address.model.dto.request.SaveAddressRequest;
import com.uc.address.model.dto.request.UpdateAddressRequest;
import com.uc.address.model.dto.response.AddressResponse;
import com.uc.address.model.mapper.AddressResponseMapper;
import com.uc.address.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AddressManager {
    private final AddressRepository repository;
    private final AddressResponseMapper addressResponseMapper;
    public AddressResponse getById(String id) {
        return addressResponseMapper.convert(findById(id));
    }

    private Address findById(String id) {
        return repository.findById(id).orElseThrow(()->new EntityNotFoundException("Adres Bulunmadı."));
    }

    public AddressResponse save(SaveAddressRequest saveAddressRequest) {
        return addressResponseMapper.convert(repository.save(Address.create(saveAddressRequest)));
    }

    public AddressResponse update(String id, UpdateAddressRequest updateAddressRequest) {
        Address address= findById(id);
        return addressResponseMapper.convert(repository.save(address.update(updateAddressRequest)));
    }

    public List<AddressResponse> getAll() {
        return addressResponseMapper.convertList(repository.findAll());
    }
}
