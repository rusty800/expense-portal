package com.expense.user.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {

    private String houseNumber;

    private String streetName;

    @NotBlank
    private String city;

    @NotBlank
    private String country;

    @NotBlank
    private String pincode;
}
