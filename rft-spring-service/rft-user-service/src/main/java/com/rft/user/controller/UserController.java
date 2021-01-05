package com.rft.user.controller;

import com.rft.spring.base.Response;
import com.rft.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rft/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public Response getUser(){
        return userService.gerUser();
    }


}
