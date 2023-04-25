package com.course.service;

import com.course.entitiy.OrderItem;
import com.course.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository repository;

    public List<OrderItem> findAll(){
        return repository.findAll();
    }

//    public OrderItem findById(long id){
//        return repository.findById(id).get();
//    }
}
