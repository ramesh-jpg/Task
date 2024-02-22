package com.Task.TaskMangementSystem.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleId implements Serializable {
    private Long id;
    private String name;
}
