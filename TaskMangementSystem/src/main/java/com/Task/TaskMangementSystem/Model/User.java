package com.Task.TaskMangementSystem.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "user")
@IdClass(UserId.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "password")
    private String password;
    @Id
    @Column(name = "email")
    private String email;

    @ManyToMany
    private Set<Role>roles;

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CharSequence getPassword() {
        return password;
    }
}
