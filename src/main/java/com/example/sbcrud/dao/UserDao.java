package com.example.sbcrud.dao;

import com.example.sbcrud.model.User;
import java.util.List;

public interface UserDao {
   void addUser(User user);
   
   List<User> getUserList();
   
   User getUserById(long id);
   
   void updateUser(User user);
   
   void deleteUser(long id);
   
   void cleanUser();
}
