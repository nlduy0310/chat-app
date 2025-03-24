package com.nlduy0310.chat_app_backend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlduy0310.chat_app_backend.entity.User;
import com.nlduy0310.chat_app_backend.exception.DuplicateEmailException;
import com.nlduy0310.chat_app_backend.repository.UserRepository;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) throws DuplicateEmailException {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser.isPresent()) {
            throw new DuplicateEmailException("email " + user.getEmail() + " already in use");
        }

        return userRepository.save(user);
    }
}
