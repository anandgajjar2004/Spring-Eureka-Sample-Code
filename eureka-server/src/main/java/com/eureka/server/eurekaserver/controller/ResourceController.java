package com.eureka.server.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/eureka/server")
public class ResourceController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}