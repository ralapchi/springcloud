package com.ralapchi.configserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetValueController {


    @Autowired
    ConfigBean configBean;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort() {
        return port;
    }

}
