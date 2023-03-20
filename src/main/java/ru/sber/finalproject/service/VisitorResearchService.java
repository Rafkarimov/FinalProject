package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.VisitorResearchDto;
import ru.sber.finalproject.mapper.VisitorResearchMapper;
import ru.sber.finalproject.model.VisitorResearch;
import ru.sber.finalproject.repository.VisitorResearchRepository;

@Slf4j
@Service
public class VisitorResearchService extends GenericService<VisitorResearch, VisitorResearchDto> {
    private final VisitorResearchRepository visitorResearchRepository;
    private final VisitorResearchMapper visitorResearchMapper;

    public VisitorResearchService(VisitorResearchRepository visitorResearchRepository, VisitorResearchMapper visitorResearchMapper) {
        super(visitorResearchRepository, visitorResearchMapper);
        this.visitorResearchRepository = visitorResearchRepository;
        this.visitorResearchMapper = visitorResearchMapper;
    }
}
