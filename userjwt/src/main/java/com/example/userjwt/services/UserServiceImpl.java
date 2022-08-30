package com.example.userjwt.services;


import com.example.userjwt.Entity.User;
import com.example.userjwt.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getOneUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User removeUser(String username) {
        User user = userRepository.findByUsername(username);

        userRepository.delete(user);
        return null;
    }
}
