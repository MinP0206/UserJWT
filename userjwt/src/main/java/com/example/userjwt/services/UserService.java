package com.example.userjwt.services;

import com.example.userjwt.Entity.User;

import java.util.List;



public interface UserService {
    List<User> getAllUser();
    User getOneUser(String username) ;
    User addUser(User user);
    User updateUser(User user);
    User removeUser(String username);
}
