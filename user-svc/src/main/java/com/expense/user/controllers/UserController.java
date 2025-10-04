package com.expense.user.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.expense.user.dtos.request.UserRequest;
import com.expense.user.dtos.response.UserResponse;
import com.expense.user.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserResponse> createUser(@Validated @RequestBody UserRequest userRequest) {
        UserResponse userResponse = userService.createNewUser(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUser(@RequestParam Long id) {
        UserResponse userResponse = userService.getUser(id);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @PostMapping("/{id}/update")
    public ResponseEntity<UserResponse> updateUserDetails(@RequestParam Long id,
            @Validated @RequestBody UserRequest userRequest) {
        UserResponse userResponse = userService.createNewUser(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

}
