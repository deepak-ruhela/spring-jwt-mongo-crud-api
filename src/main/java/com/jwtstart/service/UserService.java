package com.jwtstart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwtstart.model.User;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {

	store.add(new User(UUID.randomUUID().toString(), "Alpha", "alpha@mail.com"));
	store.add(new User(UUID.randomUUID().toString(), "Beta", "beta@mail.com"));
	store.add(new User(UUID.randomUUID().toString(), "Gama", "gama@mail.com"));
    }

    public List<User> getUsers() {
	return this.store;
    }
}
