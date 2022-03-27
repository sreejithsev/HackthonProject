package com.hack.hackthonproject.controller;

import com.hack.hackthonproject.domain.request.ServiceRegistration;
import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerDetails;
import com.hack.hackthonproject.domain.request.VolunteerRequest;
import com.hack.hackthonproject.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Validated
@Controller
public class ServiceController {

    /** The volunteer  service. */
    @Autowired
    private VolunteerService volunteerService;

    @PostMapping("/serviceRegistration")
    public String serviceRegistration(ServiceRegistration serviceRegistration) {

        try{
            volunteerService.serviceRegistration(serviceRegistration);
        }
        catch(Exception e){

        }
        return "service_registration_success";

    }

    @PostMapping("/volunteerList")
    public ModelAndView getVolunteerList(VolunteerRequest volunteerRequest)
            throws Exception {


        List<Volunteer> volunteerList = null;
        try{
            volunteerList=  volunteerService.getVolunteerList(volunteerRequest);
        }
        catch(Exception e){
        }

        if(volunteerList == null){
            Volunteer volunteer = new Volunteer();
            volunteer.setName("John");
            volunteer.setEmailId("john@outlook.com");
            volunteer.setPhoneNumber("+99112233444");
            volunteerList = new ArrayList<>();
            volunteerList.add(volunteer);
        }

        ModelAndView mav = new ModelAndView("volunteer_list");
        mav.addObject("volunteerList", volunteerList);

        return mav;
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
