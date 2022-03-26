package com.hack.hackthonproject.domain.request;


import lombok.Data;


@Data
public class Volunteer {

    private String name;
    private Address address;
    private String phoneNumber;
    private String emailId;



}