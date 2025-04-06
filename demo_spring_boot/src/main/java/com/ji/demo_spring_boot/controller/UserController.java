package com.ji.demo_spring_boot.controller;


import com.ji.demo_spring_boot.model.RegisterUserRequest;
import com.ji.demo_spring_boot.model.WebResponse;
import com.ji.demo_spring_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "api/users/register", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse <String> register(@RequestBody RegisterUserRequest request) {
        userService.register(request);
        return WebResponse.<String>builder()
                .data("User registered successfully")
                .build();
    }
}
