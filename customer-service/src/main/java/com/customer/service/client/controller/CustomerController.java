package com.customer.service.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/customer/user/")
public class CustomerController {


    @Autowired
    private RestTemplate restTemplate;
  
    @GetMapping
    public List<Object> hello() {
        String url = "http://user-service/rest/user/";
        //return restTemplate.getForEntity(url, responseType, uriVariables)rObject(url, String.class);
        List<Object> userList = restTemplate.getForObject(url, List.class);
        return userList;
    }
}