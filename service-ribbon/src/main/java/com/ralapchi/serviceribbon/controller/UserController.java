package com.ralapchi.serviceribbon.controller;

import com.ralapchi.serviceribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return userService.hiService(name);
    }
}
