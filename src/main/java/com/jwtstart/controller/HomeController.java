package com.jwtstart.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtstart.model.User;
import com.jwtstart.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private UserService userService;

//http://localhost:8080/home/users
    @GetMapping("/users")
    public List<User> getUsers() {
	System.out.println("checking ++++++++++++++++");
	return this.userService.getUsers();

    }

    @GetMapping("/current-user")
    public String getCurrentUser(Principal principal) {

	return principal.getName();

    }

    @RequestMapping("/test")
    public String test() {
	this.logger.warn("This is working message");
	return "Testing message";
    }
}
