package com.expense.user.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

    private String houseNumber;

    private String streetName;

    private String city;

    private String country;

    private String pincode;
}
