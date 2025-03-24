package com.nlduy0310.chat_app_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nlduy0310.chat_app_backend.dto.CreateUserRequestDto;
import com.nlduy0310.chat_app_backend.entity.User;
import com.nlduy0310.chat_app_backend.exception.RequestValidationException;
import com.nlduy0310.chat_app_backend.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/new")
    public ResponseEntity<?> handleCreateUserRequest(@Valid @RequestBody CreateUserRequestDto createUserRequestDto,
            BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            throw new RequestValidationException(bindingResult.getFieldErrors());
        }

        // register
        User user = dtoToEntity(createUserRequestDto);
        User createdUser = userService.registerUser(user); // if any errors happen, it will be thrown inside service and
                                                           // handled by GlobalExceptionHandler

        return ResponseEntity.ok("user " + createdUser.getEmail() + " created");
    }

    // TODO refactor conversion
    private User dtoToEntity(CreateUserRequestDto createUserRequestDto) {
        User result = new User();
        result.setEmail(createUserRequestDto.getEmail());
        result.setFullName(createUserRequestDto.getFullName());
        result.setPassword(createUserRequestDto.getPassword());
        return result;
    }

}
