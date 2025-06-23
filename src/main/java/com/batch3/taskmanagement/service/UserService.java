package com.batch3.taskmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch3.taskmanagement.model.User;
import com.batch3.taskmanagement.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String email, String password) {
        User user = repo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) return user;
        return null;
    }
}