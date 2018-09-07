package com.customer.service.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.client.entity.User;

@RestController
@RequestMapping("/rest/user")
public class UserController {
	
	public List<Object> users = new ArrayList<Object>();
   
    @RequestMapping(value = "/")
	public List<Object> getListOfUser() {
    	if(users.isEmpty()) {
    		users = intialLoad();    		
    	}
    	List<Object> list = new ArrayList<>();
    	for(Object user : users) {
    		list.add(user);
    	}    	
		return list;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public User saveChallan(@RequestBody User user) {
		users.add(user);
		return user;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable String id) {
//			for(Object user : users) {
//				if(user.getId() == Integer.parseInt(id)) {
//					users.remove(user);
//				}
//			}
	}
	
	private List<Object> intialLoad() {
		users = new ArrayList<Object>();
		User user = new User();
		user.setId(1);
		user.setFirstName("Anand");
		user.setLastName("Gajjar");
		user.setAge(10);	
		users.add(user);
		
		user = new User();
		user.setId(2);
		user.setFirstName("Dishansh");
		user.setLastName("Gaurav");
		user.setAge(20);
		users.add(user);
		
		user = new User();
		user.setId(3);
		user.setFirstName("Sasank");
		user.setLastName("Naik");
		user.setAge(30);
		users.add(user);
		
		return users;
	}
}