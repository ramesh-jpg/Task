package com.Task.TaskMangementSystem.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserId implements Serializable {
    private Long id;
    private String password;
    private String email;
}
