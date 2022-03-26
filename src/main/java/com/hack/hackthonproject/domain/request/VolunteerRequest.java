package com.hack.hackthonproject.domain.request;


import lombok.Data;

@Data
public class VolunteerRequest {

    private String requestId;
    private Address address;
    private String service;
}