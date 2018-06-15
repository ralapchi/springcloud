package com.ralapchi.servicefeign.service.impl;

import com.ralapchi.servicefeign.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "yichang";
    }
}
