package ru.sber.finalproject.cotroller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.VisitorResearchDto;
import ru.sber.finalproject.model.VisitorResearch;
import ru.sber.finalproject.service.VisitorResearchService;

@RestController
@RequestMapping("/visitor-research")
@Tag(name = "Исследования пациентов", description = "Контроллер для работы исследованиями пациентов")
public class VisitorResearchController extends GenericController<VisitorResearch, VisitorResearchDto> {
    private final VisitorResearchService visitorResearchService;

    public VisitorResearchController(VisitorResearchService visitorResearchService) {
        super(visitorResearchService);
        this.visitorResearchService = visitorResearchService;
    }
}
