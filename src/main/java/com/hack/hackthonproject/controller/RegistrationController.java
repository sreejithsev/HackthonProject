package com.hack.hackthonproject.controller;

import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerOrg;
import com.hack.hackthonproject.domain.response.RegistrationResponse;
import com.hack.hackthonproject.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    /** The volunteer  service. */
    @Autowired
    private VolunteerService volunteerService;


    @GetMapping("/volunteer")
    public ResponseEntity<?> volunteerRegistation(@RequestBody @Valid Volunteer volunteer)
            throws Exception {

        RegistrationResponse registrationResponse;
        try{
            volunteerService.volunteerRegistation(volunteer);
        }
        catch(Exception e){

        }


        return ResponseEntity.of(Optional.of(null));
    }

    @PostMapping("/volunteerOrg")
    public ResponseEntity<?> volunteerOrgRegistation(@RequestBody @Valid VolunteerOrg volunteerOrg)
            throws Exception {
        RegistrationResponse registrationResponse;
        try{
            volunteerService.volunteerOrgRegistation(volunteerOrg);
        }
        catch(Exception e){

        }
        return ResponseEntity.of(Optional.of(null));
    }
}
