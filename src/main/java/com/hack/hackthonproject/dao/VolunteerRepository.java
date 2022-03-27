package com.hack.hackthonproject.dao;

import com.hack.hackthonproject.domain.request.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {

    @Query("SELECT v FROM Volunteer v WHERE v.address.zipCode = :zipCode" + " AND v.services IN (:serviceName)")
    public List<Volunteer> searchVolunteerList(String zipCode, String serviceName);
}
