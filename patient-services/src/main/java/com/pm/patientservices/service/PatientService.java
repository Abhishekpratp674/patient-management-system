package com.pm.patientservices.service;

import com.pm.patientservices.dto.PatientRequestDTO;
import com.pm.patientservices.dto.PatientResponceDTO;
import com.pm.patientservices.mapper.PatientMapper;
import com.pm.patientservices.model.patient;
import com.pm.patientservices.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponceDTO> getPatients() {
        List<patient> patients = patientRepository.findAll();

        return patients.stream().
                map(PatientMapper::toDTO).toList();
    }

    public PatientResponceDTO createPatient(PatientRequestDTO patientRequestDTO) {
        patient newPatient = patientRepository.save(
                PatientMapper.toModel(patientRequestDTO));

        return PatientMapper.toDTO(newPatient);  //here we create a patient dto and return it back to controller
    }
}
