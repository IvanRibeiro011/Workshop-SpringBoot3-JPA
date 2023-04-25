package com.course.service;

import com.course.entitiy.Category;
import com.course.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(long id){
        return repository.findById(id).get();
    }
}
