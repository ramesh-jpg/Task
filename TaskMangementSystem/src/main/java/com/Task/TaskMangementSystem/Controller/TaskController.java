package com.Task.TaskMangementSystem.Controller;

import com.Task.TaskMangementSystem.Model.Task;
import com.Task.TaskMangementSystem.Service.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    @Autowired
    public TaskServices taskServices;

    @GetMapping("/tasks")
    public List<Task>getAllTask(){
        return taskServices.getAllTask();
    }
    @GetMapping("/task/{id}")
    public Optional<Task>getTaskById(@PathVariable Long id){
        return taskServices.getTaskById(id);
    }
    @PostMapping
    public Task createTask(Task task){
        return taskServices.createTask(task);
    }
    @PutMapping("/update/{id}")
    public Task updateTask(@PathVariable Long id,@RequestBody Task task){
        return  taskServices.updateTask(id,task);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskServices.deleteTask(id);
    }
}
