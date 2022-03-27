package com.hack.hackthonproject.controller;

import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerOrg;
import com.hack.hackthonproject.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    /** The volunteer  service. */
    @Autowired
    private VolunteerService volunteerService;


    @PostMapping("/volunteer")
    public ResponseEntity<?> volunteerRegistration(@RequestBody @Valid Volunteer volunteer) {
        return volunteerService.volunteerRegistration(volunteer);
    }

    @PostMapping("/volunteer-org")
    public ResponseEntity<?> volunteerOrgRegistation(@RequestBody @Valid VolunteerOrg volunteerOrg) {
        return volunteerService.volunteerOrgRegistration(volunteerOrg);
    }
}
