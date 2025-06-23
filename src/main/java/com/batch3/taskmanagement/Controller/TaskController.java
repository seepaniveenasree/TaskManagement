package com.batch3.taskmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.taskmanagement.model.Task;
import com.batch3.taskmanagement.service.TaskService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
    private TaskService service;

    @PostMapping("/add")
    public Task add(@RequestBody Task task) {
        return service.addTask(task);
    }

    @GetMapping("/get/{userId}")
    public List<Task> get(@PathVariable String userId) {
        return service.getTasks(userId);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        service.deleteTask(id);
        return ResponseEntity.ok("Deleted successfully");
    }

    @PutMapping("/update")
    public Task update(@RequestBody Task task) {
        return service.updateTask(task);
    }
}
