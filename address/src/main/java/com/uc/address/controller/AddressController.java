package com.uc.address.controller;

import com.uc.address.manager.AddressManager;
import com.uc.address.model.dto.request.SaveAddressRequest;
import com.uc.address.model.dto.request.UpdateAddressRequest;
import com.uc.address.model.dto.response.AddressResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressManager addressManager;

    @GetMapping("/{id}")
   public AddressResponse getById(@PathVariable String id){
       return addressManager.getById(id);
   }
    @GetMapping()
    public List<AddressResponse> getAll(){
        return addressManager.getAll();
    }
   @PostMapping
   public AddressResponse save(@RequestBody SaveAddressRequest saveAddressRequest){
       return addressManager.save(saveAddressRequest);
   }
   @PutMapping("/{id}")
   public AddressResponse update(@PathVariable String id,@RequestBody  UpdateAddressRequest updateAddressRequest){
       return addressManager.update(id,updateAddressRequest);
   }
}
