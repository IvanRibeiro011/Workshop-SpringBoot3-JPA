package com.course.service;

import com.course.entitiy.Order;
import com.course.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(long id) {
        return repository.findById(id).get();
    }
}
