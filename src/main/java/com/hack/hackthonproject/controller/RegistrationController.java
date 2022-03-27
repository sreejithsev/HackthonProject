package com.hack.hackthonproject.controller;

import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerOrg;
import com.hack.hackthonproject.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@Controller
public class RegistrationController {

    /** The volunteer  service. */
    @Autowired
    private VolunteerService volunteerService;


    @PostMapping("/volunteer")
    public String volunteerRegistration(Volunteer volunteer) {
        volunteerService.volunteerRegistration(volunteer);
        return "register_success";

    }

    @PostMapping("/volunteer-org")
    public String volunteerOrgRegistation(@Valid VolunteerOrg volunteerOrg) {
        volunteerService.volunteerOrgRegistration(volunteerOrg);
        return "register_success";
    }
}
