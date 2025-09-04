package com.pm.patientservices.controller;


import com.pm.patientservices.dto.PatientRequestDTO;
import com.pm.patientservices.dto.PatientResponceDTO;
import com.pm.patientservices.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService; 
    }
    @GetMapping
    public ResponseEntity<List<PatientResponceDTO>>getPatients(){
        List<PatientResponceDTO> patients= patientService.getPatients();
        return ResponseEntity.ok().body(patients);
    }
    @PostMapping
    public ResponseEntity<PatientResponceDTO> createPatient(
            @Valid @RequestBody PatientRequestDTO patientRequestDTO){
        PatientResponceDTO patientResponseDTO = patientService.createPatient(patientRequestDTO);
        return ResponseEntity.ok().body(patientResponseDTO);

    }
}
