package com.pm.patientservices.mapper;

import com.pm.patientservices.dto.PatientResponceDTO;
import com.pm.patientservices.model.patient;

public class PatientMapper {
    public static PatientResponceDTO toDTO(patient patient){
        PatientResponceDTO patientDTO = new PatientResponceDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.getAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.getDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;
    }
}
