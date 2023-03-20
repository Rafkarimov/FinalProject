package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sber.finalproject.dto.MedSpecializationDto;
import ru.sber.finalproject.mapper.MedSpecializationMapper;
import ru.sber.finalproject.model.MedSpecialization;
import ru.sber.finalproject.repository.MedSpecializationRepository;

import java.util.Optional;

@Slf4j
@Service
public class MedSpecializationService extends GenericService<MedSpecialization, MedSpecializationDto> {
    private final MedSpecializationRepository medSpecializationRepository;
    private final MedSpecializationMapper medSpecializationMapper;

    public MedSpecializationService(MedSpecializationRepository medSpecializationRepository, MedSpecializationMapper medSpecializationMapper) {
        super(medSpecializationRepository, medSpecializationMapper);
        this.medSpecializationRepository = medSpecializationRepository;
        this.medSpecializationMapper = medSpecializationMapper;
    }
}
