package com.Task.TaskMangementSystem.Service;

import com.Task.TaskMangementSystem.Model.User;
import com.Task.TaskMangementSystem.Model.Role;
import com.Task.TaskMangementSystem.Repository.RoleRepository;
import com.Task.TaskMangementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User registerUser(User user) {
        // Set default role for a registered user
        Role userRole = roleRepository.findByName("USER");
        if (userRole == null) {
            userRole = new Role();
            userRole.setName("USER");
            roleRepository.save(userRole);
        }

        Set<Role> roles = new HashSet<>();
        roles.add(userRole);

        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }







}

