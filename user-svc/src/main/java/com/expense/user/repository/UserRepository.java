package com.expense.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
