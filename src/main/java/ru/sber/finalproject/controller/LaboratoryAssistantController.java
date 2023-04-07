package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.LaboratoryAssistantDto;
import ru.sber.finalproject.model.LaboratoryAssistant;
import ru.sber.finalproject.service.LaboratoryAssistantService;

@RestController
@RequestMapping("/laboratoryassistant")
@Tag(name = "Лаборант", description = "Контроллер для лаборанта")
public class LaboratoryAssistantController extends GenericController<LaboratoryAssistant, LaboratoryAssistantDto> {
    private final LaboratoryAssistantService laboratoryAssistantService;

    public LaboratoryAssistantController(LaboratoryAssistantService laboratoryAssistantService) {
        super(laboratoryAssistantService);
        this.laboratoryAssistantService = laboratoryAssistantService;
    }
}
