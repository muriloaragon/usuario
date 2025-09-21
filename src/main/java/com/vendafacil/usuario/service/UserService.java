package com.vendafacil.usuario.service;

import com.vendafacil.usuario.model.User;
import com.vendafacil.usuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Read all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Read by username
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Update
    public Optional<User> updateUser(String username, User updatedUser) {
        return userRepository.findByUsername(username).map(user -> {
            user.setName(updatedUser.getName());
            user.setPassword(updatedUser.getPassword());
            return userRepository.save(user);
        });
    }

    // Delete
    public void deleteUserByUsername(String username) {
        userRepository.deleteByUsername(username);
    }
}