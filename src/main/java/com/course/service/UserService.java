package com.course.service;

import com.course.entitiy.User;
import com.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(long id){
        return repository.findById(id).get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User user){
        User db = repository.getReferenceById(id);
        updateData(db,user);
        return repository.save(db);
    }

    private void updateData(User db, User user) {
        db.setName(user.getName());
        db.setEmail(user.getEmail());
        db.setPhone(user.getPhone());
    }
}
