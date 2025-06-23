package com.batch3.taskmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.taskmanagement.model.Task;
import com.batch3.taskmanagement.repository.TaskRepository;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/report")
public class ReportController {

	@Autowired
    private TaskRepository repo;

    @GetMapping("/all")
    public List<Task> allTasks() {
        return repo.findAll();
    }
}
