package com.eureka.client.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/eureka/client")
public class ResourceController {


    @Autowired
    private RestTemplate restTemplate;
  
    @GetMapping
    public String hello() {
        String url = "http://eureka-server/rest/eureka/server";
        return restTemplate.getForObject(url, String.class);
    }
}