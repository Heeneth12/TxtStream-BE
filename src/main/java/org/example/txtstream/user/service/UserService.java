package org.example.txtstream.user.service;

import org.example.txtstream.user.model.UserModel;
import org.example.txtstream.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public UserModel createUser(UserModel userModel) {
        // Perform any additional business logic or validation if needed
        return userRepository.save(userModel);
    }

    // Get user by ID
    public Optional<UserModel> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    // Optionally: Get all users
    public Iterable<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

}
