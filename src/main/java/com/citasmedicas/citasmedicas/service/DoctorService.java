package com.citasmedicas.citasmedicas.service;

import java.util.List;
import com.citasmedicas.citasmedicas.controller.dto.DoctorRequestDto;
import com.citasmedicas.citasmedicas.controller.dto.DoctorResponseDto;
import com.citasmedicas.citasmedicas.model.entity.Doctor;

public interface DoctorService {
    List<DoctorResponseDto>getDoctores();
    DoctorResponseDto getDoctoresById(Long id);
    List<DoctorResponseDto> getDoctoresByEspecialidad(String especialidad);
    DoctorResponseDto createDoctor(DoctorRequestDto doctor);
    DoctorResponseDto updateDoctor(DoctorRequestDto doctor);

    void deleteDoctor(Long id);

    Doctor encontrarporid(Long id);
}
