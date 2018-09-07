package com.customer.service.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.customer.service.client.entity.User;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceClientApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner(){
    	return new CommandLineRunner() {
			
			@Override
			public void run(String... arg0) throws Exception {
				
				User user = new User();
				user.setId(1);
				user.setFirstName("Anand");
				user.setLastName("Gajjar");
				user.setAge(10);				
				
				user = new User();
				user.setId(2);
				user.setFirstName("Dishansh");
				user.setLastName("Gaurav");
				user.setAge(20);
				
				user = new User();
				user.setId(3);
				user.setFirstName("Sasank");
				user.setLastName("Naik");
				user.setAge(30);
			}
		};
    }
}
