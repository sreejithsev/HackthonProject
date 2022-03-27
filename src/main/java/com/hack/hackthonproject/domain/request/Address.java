package com.hack.hackthonproject.domain.request;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String address1;
    @NotNull
    private String city;
    @NotNull
    private String state;
    @NotNull
    private String zipCode;
    @NotNull
    private String countryCode;
}