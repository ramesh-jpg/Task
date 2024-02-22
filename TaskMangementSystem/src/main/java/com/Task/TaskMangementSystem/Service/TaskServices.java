package com.Task.TaskMangementSystem.Service;


import com.Task.TaskMangementSystem.Model.Task;
import com.Task.TaskMangementSystem.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServices {
   @Autowired
    private TaskRepository taskRepository;

   public List<Task>getAllTask(){
       return taskRepository.findAll();
   }

   public Optional<Task> getTaskById(Long id){
       return taskRepository.findById(id);
   }

   public Task createTask(Task task){
       return taskRepository.save(task);
   }
   public Task updateTask(Long id ,Task task){
       Optional<Task> optionalTask = taskRepository.findById(id);
       if (optionalTask.isPresent()) {
           Task existingTask = optionalTask.get();
           existingTask.setTitle(task.getTitle());
           existingTask.setDescription(task.getDescription());
           existingTask.setDueDate(task.getDueDate());
           existingTask.setStatus(task.getStatus());
           return taskRepository.save(existingTask);
       }
       return null;
   }

   public void deleteTask(Long id){
       taskRepository.deleteById(id);
   }
}
