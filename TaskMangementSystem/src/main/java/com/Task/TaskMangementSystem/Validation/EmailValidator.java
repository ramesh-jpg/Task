package com.Task.TaskMangementSystem.Validation;

import com.Task.TaskMangementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<UniqueEmail, String> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && userRepository.findByEmail(email) == null;
    }
}
