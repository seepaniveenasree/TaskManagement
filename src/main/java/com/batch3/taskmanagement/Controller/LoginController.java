package com.batch3.taskmanagement.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.taskmanagement.model.User;
import com.batch3.taskmanagement.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Pro")
public class LoginController {
	
	    @Autowired
	    private UserService service;

	    @PostMapping("/register")
	    public User register(@RequestBody User user) {
	        return service.register(user);
	    }

	    @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
	        User user = service.login(loginData.get("email"), loginData.get("password"));
	        if (user != null) return ResponseEntity.ok(user);
	        return ResponseEntity.status(401).body("Invalid login");
	    }
}

