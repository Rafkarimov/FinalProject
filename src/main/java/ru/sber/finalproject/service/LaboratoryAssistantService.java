package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sber.finalproject.dto.LaboratoryAssistantDto;
import ru.sber.finalproject.mapper.LaboratoryAssistantMapper;
import ru.sber.finalproject.model.LaboratoryAssistant;
import ru.sber.finalproject.model.VisitorResearch;
import ru.sber.finalproject.repository.LaboratoryAssistantRepository;
import ru.sber.finalproject.repository.VisitorResearchRepository;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
public class LaboratoryAssistantService extends GenericService<LaboratoryAssistant, LaboratoryAssistantDto> {
    private final LaboratoryAssistantRepository laboratoryAssistantRepository;
    private final LaboratoryAssistantMapper laboratoryAssistantMapper;

    private final VisitorResearchRepository visitorResearchRepository;

    public LaboratoryAssistantService(LaboratoryAssistantRepository laboratoryAssistantRepository, LaboratoryAssistantMapper laboratoryAssistantMapper, VisitorResearchRepository visitorResearchRepository) {
        super(laboratoryAssistantRepository, laboratoryAssistantMapper);
        this.laboratoryAssistantRepository = laboratoryAssistantRepository;
        this.laboratoryAssistantMapper = laboratoryAssistantMapper;
        this.visitorResearchRepository = visitorResearchRepository;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        LaboratoryAssistant assistant = laboratoryAssistantRepository.findById(id).get();
        List<VisitorResearch> visitorResearches = assistant.getVisitorResearchList();
        visitorResearchRepository.deleteAll(visitorResearches);
        laboratoryAssistantRepository.deleteById(id);
    }
}
