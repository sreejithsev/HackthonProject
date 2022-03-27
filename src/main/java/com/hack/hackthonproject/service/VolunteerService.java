package com.hack.hackthonproject.service;


import com.hack.hackthonproject.dao.VolunteerOrgRepository;
import com.hack.hackthonproject.dao.VolunteerRepository;
import com.hack.hackthonproject.dao.VolunteerRequestRepository;
import com.hack.hackthonproject.domain.request.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * The Class VolunteerService.
 */
@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;
    @Autowired
    private VolunteerOrgRepository volunteerOrgRepository;

    @Autowired
    VolunteerRequestRepository volunteerRequestRepository;





    public ResponseEntity<Volunteer> volunteerRegistration(Volunteer volunteer) {
        Volunteer _volunteer = volunteerRepository.save(volunteer);
        return new ResponseEntity<>(_volunteer, HttpStatus.CREATED);
    }

    public ResponseEntity<VolunteerOrg> volunteerOrgRegistration(VolunteerOrg volunteerOrg) {
        VolunteerOrg _volunteerOrg = volunteerOrgRepository.save(volunteerOrg);
        return new ResponseEntity<>(_volunteerOrg, HttpStatus.CREATED);
    }

    public List<Volunteer> getVolunteerList(VolunteerRequest volunteerRequest) {
      //  volunteerRequest _volunteerRequest = volunteerRequestRepository.save
        String zipCode ="";
        if(volunteerRequest.getAddress().getZipCode()!=null){
            zipCode=volunteerRequest.getAddress().getZipCode();
        }

        List<Volunteer> volunteerList = volunteerRepository.searchVolunteerList(zipCode,volunteerRequest.getService());

        return volunteerList;
    }

    public ResponseEntity<Volunteer> serviceRegistration(ServiceRegistration serviceRegistration)
    {
        Optional<Volunteer> volunteer =null;
        if(serviceRegistration.getVolunteerId()!=null)
        volunteer =volunteerRepository.findById(serviceRegistration.getVolunteerId());
        if(serviceRegistration.getServices()!=null){
            volunteer.get().getServices().addAll(serviceRegistration.getServices());
        }
        return new ResponseEntity<>(volunteer.get(), HttpStatus.CREATED);
    }

    public List<String> VolunteerProcessing(VolunteerDetails volunteerDetails) {

        List<String> volunteerList = volunteerDetails.getVolunteerId();


        return volunteerList;
    }
}
