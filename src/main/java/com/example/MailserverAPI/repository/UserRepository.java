package com.example.MailserverAPI.repository;


import com.example.MailserverAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByUsername(String username);
}
