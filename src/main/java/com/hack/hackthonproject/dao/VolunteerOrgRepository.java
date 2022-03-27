package com.hack.hackthonproject.dao;

import com.hack.hackthonproject.domain.request.VolunteerOrg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerOrgRepository extends JpaRepository<VolunteerOrg, Long> {
}
