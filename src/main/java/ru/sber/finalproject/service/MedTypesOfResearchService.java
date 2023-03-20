package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.MedTypesOfResearchDto;
import ru.sber.finalproject.mapper.MedTypesOfResearchMapper;
import ru.sber.finalproject.model.MedTypesOfResearch;
import ru.sber.finalproject.repository.MedTypesOfResearchRepository;

@Slf4j
@Service
public class MedTypesOfResearchService extends GenericService<MedTypesOfResearch, MedTypesOfResearchDto> {
    private final MedTypesOfResearchRepository medTypesOfResearchRepository;
    private final MedTypesOfResearchMapper medTypesOfResearchMapper;


    public MedTypesOfResearchService(MedTypesOfResearchRepository medTypesOfResearchRepository, MedTypesOfResearchMapper medTypesOfResearchMapper) {
        super(medTypesOfResearchRepository, medTypesOfResearchMapper);
        this.medTypesOfResearchRepository = medTypesOfResearchRepository;
        this.medTypesOfResearchMapper = medTypesOfResearchMapper;
    }
}
