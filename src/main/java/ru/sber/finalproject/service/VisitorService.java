package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.VisitorDto;
import ru.sber.finalproject.mapper.VisitorMapper;
import ru.sber.finalproject.model.Visitor;
import ru.sber.finalproject.repository.VisitorRepository;

@Slf4j
@Service
public class VisitorService extends GenericService<Visitor, VisitorDto> {
    private final VisitorRepository visitorRepository;
    private final VisitorMapper visitorMapper;

    public VisitorService(VisitorRepository visitorRepository, VisitorMapper visitorMapper) {
        super(visitorRepository, visitorMapper);
        this.visitorRepository = visitorRepository;
        this.visitorMapper = visitorMapper;
    }
}
