package com.hack.hackthonproject.controller;

import com.hack.hackthonproject.domain.request.ServiceRegistration;
import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerDetails;
import com.hack.hackthonproject.domain.request.VolunteerRequest;
import com.hack.hackthonproject.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/service")
public class ServiceController {

    /** The volunteer  service. */
    @Autowired
    private VolunteerService volunteerService;

    @GetMapping("/serviceRegistration")
    public ResponseEntity<?> serviceRegistration(@RequestBody @Valid ServiceRegistration serviceRegistration)
            throws Exception {

        try{
            volunteerService.serviceRegistration(serviceRegistration);
        }
        catch(Exception e){

        }
        return null;

    }

    @GetMapping("/volunteerList")
    public ResponseEntity<?> getVolunteerList(@RequestBody @Valid VolunteerRequest volunteerRequest)
            throws Exception {


        List<Volunteer> volunteerList = null;
        try{
            volunteerList=  volunteerService.getVolunteerList(volunteerRequest);
        }
        catch(Exception e){
        }
        return ResponseEntity.of(Optional.of(volunteerList));
    }

    @GetMapping("/volunteerProcess")
    public ResponseEntity<?> VolunteerProcessing(@RequestBody @Valid VolunteerDetails volunteerDetails)
            throws Exception {
        List<String> volunteerList = null;
        try{
            volunteerList=  volunteerService.VolunteerProcessing(volunteerDetails);
        }
        catch(Exception e){
        }
        return ResponseEntity.of(Optional.of(volunteerList));
    }


}
