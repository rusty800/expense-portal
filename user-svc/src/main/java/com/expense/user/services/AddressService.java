package com.expense.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.user.entity.Address;
import com.expense.user.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    private boolean addUserAddress() {
        return true;
    }

    private boolean updateAddress() {
        return true;
    }

    private Address getUserAddress() {
        return null;
    }
}
