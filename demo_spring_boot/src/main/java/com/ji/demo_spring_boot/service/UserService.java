package com.ji.demo_spring_boot.service;


import com.ji.demo_spring_boot.repository.UserRepository;
import com.ji.demo_spring_boot.entity.User;

import com.ji.demo_spring_boot.model.RegisterUserRequest;
import com.ji.demo_spring_boot.security.BCrypt;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    @Transactional
    public void register(RegisterUserRequest request){
        Set<ConstraintViolation<RegisterUserRequest>> constraintViolations = validator.validate(request);
        if(constraintViolations.size() != 0 ){
            throw new ConstraintViolationException("Invalid request", constraintViolations);
        }

        if(userRepository.existsById(request.getUsername())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already registered");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setToken(null);
        user.setExpireAt(LocalDateTime.now().plusDays(7));
        user.setToken(UUID.randomUUID().toString());
        user.setExpireAt(LocalDateTime.now().plusDays(1));

        userRepository.save(user);
    }
}
