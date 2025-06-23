package com.batch3.taskmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch3.taskmanagement.model.Task;
import com.batch3.taskmanagement.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public Task addTask(Task task) {
        return repo.save(task);
    }

    public List<Task> getTasks(String userId) {
        return repo.findByUserId(userId);
    }

    public void deleteTask(String id) {
        repo.deleteById(id);
    }

    public Task updateTask(Task task) {
        return repo.save(task);
    }
}