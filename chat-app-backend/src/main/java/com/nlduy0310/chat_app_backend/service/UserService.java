package com.nlduy0310.chat_app_backend.service;

import org.springframework.stereotype.Service;

import com.nlduy0310.chat_app_backend.entity.User;
import com.nlduy0310.chat_app_backend.exception.DuplicateEmailException;

@Service
public interface UserService {
    User registerUser(User user) throws DuplicateEmailException;
}
