package com.hack.hackthonproject.domain.request;


import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Entity
@Data
@Table(name = "volunteer")
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String name;
    @NotNull
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String emailId;
}