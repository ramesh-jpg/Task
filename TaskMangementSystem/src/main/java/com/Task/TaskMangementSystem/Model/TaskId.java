package com.Task.TaskMangementSystem.Model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TaskId implements Serializable {
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;

}
