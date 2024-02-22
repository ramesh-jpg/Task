package com.Task.TaskMangementSystem.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "task")
@IdClass(TaskId.class)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Id
    @Column(name = "tittle")
    private String title;

    @Id
    @Column(name = "description")
    private String description;

    @Id
    @Column(name = "dueDate")
    private LocalDate dueDate;

    @Id
    @Column(name = "status")
    private String status;
}
