package com.expense.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    private String firstName;

    private String middleName;

    private String lastName;

    private String phoneNumber;

    private String email;

}
