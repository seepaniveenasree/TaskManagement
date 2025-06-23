package com.batch3.taskmanagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.taskmanagement.model.User;
import com.batch3.taskmanagement.repository.UserRepository;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private UserRepository userRepository;

//	@PostMapping
//    public User createUser(@RequestBody User user) {
//        return UserService.createUser(user);
//    }
	
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setWork(updatedUser.getWork());
            user.setPassword(updatedUser.getPassword());
            userRepository.save(user);
            return "User updated successfully!";
        }).orElse("User not found");
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return "User deleted successfully!";
    }
}
