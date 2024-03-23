package com.example.MailserverAPI.service;

import com.example.MailserverAPI.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List <User> getAllUsers();
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id, String username, String password, String email);
    String getUserPassword(String username);
}

