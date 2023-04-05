package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.MedSpecializationDto;
import ru.sber.finalproject.model.MedSpecialization;
import ru.sber.finalproject.service.MedSpecializationService;

@RestController
@RequestMapping("/medspecialization")
@Tag(name = "Медицинская специальность", description = "Контроллер для работы с медицинскими специальностями")
public class MedSpecializationController extends GenericController<MedSpecialization, MedSpecializationDto> {
    private final MedSpecializationService medSpecializationService;
    public MedSpecializationController(MedSpecializationService medSpecializationService) {
        super(medSpecializationService);
        this.medSpecializationService = medSpecializationService;
    }
}
