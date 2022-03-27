package com.hack.hackthonproject.dao;

import com.hack.hackthonproject.domain.request.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
