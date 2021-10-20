package com.akifsonmez.service;

import com.akifsonmez.entity.User;
import com.akifsonmez.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUser(String id) {
        return userRepository.findById(id);
    }

    public void updateUser(String id, User user) {
        if (userRepository.existsById(id)) {
            userRepository.save(user);
        }
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
