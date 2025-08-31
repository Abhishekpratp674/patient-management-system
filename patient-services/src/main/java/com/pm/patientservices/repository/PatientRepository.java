package com.pm.patientservices.repository;

import com.pm.patientservices.model.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<patient, UUID> {

}
