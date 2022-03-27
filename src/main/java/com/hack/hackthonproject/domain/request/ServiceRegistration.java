package com.hack.hackthonproject.domain.request;


import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Data
public class ServiceRegistration {

    private String volunteerId;
    private String services ;
}