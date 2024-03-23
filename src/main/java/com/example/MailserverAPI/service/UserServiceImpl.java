package com.example.MailserverAPI.service;

import com.example.MailserverAPI.model.User;
import com.example.MailserverAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl (UserRepository userRepository) {this.userRepository = userRepository;}
    @Override
    public User getUserById(Long id){
        Optional <User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
    @Override
    public List<User> getAllUsers(){return userRepository.findAll();}
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    // gets the whole User object to be able to update its fields
    public void updateUser(Long id, String username, String password, String email) {
        Optional <User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()) { // Sjekker om bruker eksisterer
            User user = optionalUser.get();
            // oppdaterer brukernavn
            if (username != null) { user.setUsername(username); }
            // oppdaterer passord
            if(password != null) { user.setPassword(password); }
            // oppdaterer email
            if (email != null) { user.setEmail(email); }
            userRepository.save(user);
        }
    }
    @Override
    public String getUserPassword(String username){ // logic for getting password for user
        User user = userRepository.findByUsername(username);
        if (user != null){
            return user.getPassword();
        }else { return null; }
    }
}