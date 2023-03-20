package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.DoctorDto;
import ru.sber.finalproject.mapper.DoctorMapper;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.repository.DoctorRepository;

@Slf4j
@Service
public class DoctorService extends GenericService <Doctor, DoctorDto> {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public DoctorService(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        super(doctorRepository, doctorMapper);
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }
}
