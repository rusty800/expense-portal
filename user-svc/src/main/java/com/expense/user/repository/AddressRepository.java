package com.expense.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.user.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
