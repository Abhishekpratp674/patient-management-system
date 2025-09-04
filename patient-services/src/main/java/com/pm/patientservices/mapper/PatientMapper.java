package com.pm.patientservices.mapper;

import com.pm.patientservices.dto.PatientRequestDTO;
import com.pm.patientservices.dto.PatientResponceDTO;
import com.pm.patientservices.model.patient;

import java.time.LocalDate;

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
    public static patient toModel(PatientRequestDTO patientRequestDTO){
        patient patient = new patient();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAdress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }
}
