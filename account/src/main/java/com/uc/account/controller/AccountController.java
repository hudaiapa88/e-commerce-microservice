package com.uc.account.controller;

import com.uc.account.manager.AccountManager;
import com.uc.account.model.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("account")
@RequiredArgsConstructor
@RestController
public class AccountController {

    private final AccountManager accountManager;
    public UserResponse getById(String id){
        return accountManager.getById(id);
    }

}
