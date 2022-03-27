package com.hack.hackthonproject.domain.request;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "volunteer_requests")
public class VolunteerRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String zipCode;
    @NotNull
    private String service;
}
