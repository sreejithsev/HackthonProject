package com.hack.hackthonproject.controller;

import com.hack.hackthonproject.domain.request.ServiceRegistration;
import com.hack.hackthonproject.domain.request.Volunteer;
import com.hack.hackthonproject.domain.request.VolunteerOrg;
import com.hack.hackthonproject.domain.request.VolunteerRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/hackthon")
    public String viewHomePage() {
        return "index";
    }


    @GetMapping("/volunteerRegister")
    public String volunteerRegister(Model model) {
        model.addAttribute("volunteer", new Volunteer());
        return "volunteer_singup";
    }

    @GetMapping("/volunteerOrgRegister")
    public String volunteerOrgRegister(Model model) {
        model.addAttribute("volunteerOrg", new VolunteerOrg());
        return "volunteer_org_singup";
    }

    @GetMapping("/volunteerSearch")
    public String volunteerSearch(Model model) {
        model.addAttribute("volunteerRequest", new VolunteerRequest());
        return "volunteer_search";
    }

    @GetMapping("/volunteerServiceRegister")
    public String volunteerServiceRegister(Model model) {
        model.addAttribute("serviceRegistration",new ServiceRegistration());
        return "volunteer_service_register";
    }
}
