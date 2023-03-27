package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.VisitorDto;
import ru.sber.finalproject.model.Visitor;
import ru.sber.finalproject.service.VisitorService;

@RestController
@RequestMapping("/visitor")
@Tag(name = "Пациенты", description = "Контроллер для работы пациентами")
public class VisitorController extends GenericController<Visitor, VisitorDto> {
    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        super(visitorService);
        this.visitorService = visitorService;
    }
}
