package com.course.controller;

import com.course.entitiy.User;
import com.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;
    @GetMapping("/all")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(service.findById(id),HttpStatus.OK );
    }
    @PostMapping("/insert")
    public ResponseEntity<User> insert(@RequestBody User user){
        return new ResponseEntity<>(service.insert(user),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
