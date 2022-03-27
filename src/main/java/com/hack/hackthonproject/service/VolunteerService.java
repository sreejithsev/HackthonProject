package com.hack.hackthonproject.service;


import com.hack.hackthonproject.dao.VolunteerOrgRepository;
import com.hack.hackthonproject.dao.VolunteerRepository;
import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerOrg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


/**
 * The Class PaymentService.
 */
@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;
    @Autowired
    private VolunteerOrgRepository volunteerOrgRepository;

    public ResponseEntity<Volunteer> volunteerRegistration(Volunteer volunteer) {
        Volunteer _volunteer = volunteerRepository.save(volunteer);
        return new ResponseEntity<>(_volunteer, HttpStatus.CREATED);
    }

    public ResponseEntity<VolunteerOrg> volunteerOrgRegistration(VolunteerOrg volunteerOrg) {
        VolunteerOrg _volunteerOrg = volunteerOrgRepository.save(volunteerOrg);
        return new ResponseEntity<>(_volunteerOrg, HttpStatus.CREATED);
    }
}
