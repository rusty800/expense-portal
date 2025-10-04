package com.expense.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.user.dtos.request.UserRequest;
import com.expense.user.dtos.response.UserResponse;
import com.expense.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressService addressService;

    public UserResponse createNewUser(UserRequest userRequest) {

        return null;
    }

    public UserResponse getUser(Long userId) {

        return null;
    }

}
