package com.Task.TaskMangementSystem.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="role")
@IdClass(RoleId.class)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "name")
    private String name;
}
