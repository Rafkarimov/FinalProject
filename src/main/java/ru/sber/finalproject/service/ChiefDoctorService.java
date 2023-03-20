package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.ChiefDoctorDto;
import ru.sber.finalproject.mapper.ChiefDoctorMapper;
import ru.sber.finalproject.model.ChiefDoctor;
import ru.sber.finalproject.repository.ChiefDoctorRepository;

@Slf4j
@Service
public class ChiefDoctorService extends GenericService<ChiefDoctor, ChiefDoctorDto> {
    private final ChiefDoctorRepository chiefDoctorRepository;
    private final ChiefDoctorMapper chiefDoctorMapper;

    public ChiefDoctorService(ChiefDoctorRepository chiefDoctorRepository, ChiefDoctorMapper chiefDoctorMapper) {
        super(chiefDoctorRepository, chiefDoctorMapper);
        this.chiefDoctorRepository = chiefDoctorRepository;
        this.chiefDoctorMapper = chiefDoctorMapper;
    }
}
