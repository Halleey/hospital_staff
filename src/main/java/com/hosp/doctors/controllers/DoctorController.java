package com.hosp.doctors.controllers;
import com.hosp.doctors.dtos.AuthRequestDTO;
import com.hosp.doctors.dtos.DoctorLoginDTO;
import com.hosp.doctors.dtos.DoctorRequestDTO;
import com.hosp.doctors.dtos.DoctorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface DoctorController {

    @PostMapping
    public ResponseEntity<DoctorResponseDTO> saveDoctors(@RequestBody  DoctorRequestDTO requestDTO);

    @PostMapping("/login")
    public  ResponseEntity<DoctorLoginDTO> getDoctor(@RequestBody AuthRequestDTO requestDTO);
}
