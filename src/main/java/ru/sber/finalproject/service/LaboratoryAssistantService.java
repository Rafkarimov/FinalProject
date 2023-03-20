package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.LaboratoryAssistantDto;
import ru.sber.finalproject.mapper.LaboratoryAssistantMapper;
import ru.sber.finalproject.model.LaboratoryAssistant;
import ru.sber.finalproject.repository.LaboratoryAssistantRepository;

@Slf4j
@Service
public class LaboratoryAssistantService extends GenericService<LaboratoryAssistant, LaboratoryAssistantDto> {
    private final LaboratoryAssistantRepository laboratoryAssistantRepository;
    private final LaboratoryAssistantMapper laboratoryAssistantMapper;

    public LaboratoryAssistantService(LaboratoryAssistantRepository laboratoryAssistantRepository, LaboratoryAssistantMapper laboratoryAssistantMapper) {
        super(laboratoryAssistantRepository, laboratoryAssistantMapper);
        this.laboratoryAssistantRepository = laboratoryAssistantRepository;
        this.laboratoryAssistantMapper = laboratoryAssistantMapper;
    }
}
