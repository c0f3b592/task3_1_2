package com.example.sbcrud.service;

import com.example.sbcrud.model.User;
import java.util.List;

public interface UserService {
    
    void addUser(User user);
    
    List<User> getUserList();
    
    User getUserById(long id);
    
    void updateUser(User user);
    
    void deleteUser(long id);
    
    void cleanUser();
}
