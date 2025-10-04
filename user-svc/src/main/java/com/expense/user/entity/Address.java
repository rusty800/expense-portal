package com.expense.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "address")
public class Address extends BaseEntity {

    private Long userId;

    private String houseNumber;

    private String streetName;

    private String city;

    private String country;

    private String pincode;

}
