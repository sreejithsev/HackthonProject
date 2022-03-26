package com.hack.hackthonproject.domain.request;


import lombok.Data;


@Data

public class Address {

    private String address1;
    private String city;
    private String state;
    private String zipCode;
    private String countryCode;
}