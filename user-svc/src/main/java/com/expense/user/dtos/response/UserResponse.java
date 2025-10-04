package com.expense.user.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String firstName;

    private String middleName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private AddressResponse address;
}
