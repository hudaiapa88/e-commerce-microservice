package com.uc.account.controller;

import com.uc.account.manager.AccountManager;
import com.uc.account.manager.LoginResponse;
import com.uc.account.model.dto.request.LoginRequest;
import com.uc.account.model.dto.request.SaveUserRequest;
import com.uc.account.model.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("account")
@RequiredArgsConstructor
@RestController
public class AccountController {

    private final AccountManager accountManager;
    @GetMapping("/{id}")
    public UserResponse getById(@PathVariable String id){
        return accountManager.getById(id);
    }

    @PostMapping
    public UserResponse save(@RequestBody SaveUserRequest saveUserRequest){
        return accountManager.save(saveUserRequest);
    }
    @PostMapping("/login")
    public  LoginResponse login(@RequestBody LoginRequest loginRequest){
        return accountManager.login(loginRequest);
    }

}
