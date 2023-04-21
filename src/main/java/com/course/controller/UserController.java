package com.course.controller;

import com.course.entitiy.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/all")
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria","maria@gmail.com","999999999","123456");
        return new ResponseEntity<>(u,HttpStatus.OK);
    }
}
