package com.javatechie.jwt.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.javatechie.jwt.api.model.User;
import com.javatechie.jwt.api.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}
     @Autowired
	private UserRepository userRepository;
     
     

     @PostConstruct
	public void initUsers()
	{
		List<User> lstUser=Stream.of(
				new User(101,"javatechie","password","jtechie@gmail.com"),
				new User(102,"user1","pwd1","user1@gmail.com"),
				new User(103,"user2","pwd1","user2@gmail.com"),
				new User(104,"user3","pwd1","user3@gmail.com")	
				).collect(Collectors.toList());
		userRepository.saveAll(lstUser);
	}
     
}
