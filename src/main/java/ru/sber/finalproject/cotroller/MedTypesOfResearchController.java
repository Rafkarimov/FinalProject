package ru.sber.finalproject.cotroller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.MedTypesOfResearchDto;
import ru.sber.finalproject.model.MedTypesOfResearch;
import ru.sber.finalproject.service.MedTypesOfResearchService;

@RestController
@RequestMapping("/med-types-of-research")
@Tag(name = "Виды медицинских исследований", description = "Контроллер для работы с видами медицинских исследований")
public class MedTypesOfResearchController extends GenericController<MedTypesOfResearch, MedTypesOfResearchDto> {
    private final MedTypesOfResearchService medTypesOfResearchService;

    public MedTypesOfResearchController(MedTypesOfResearchService medTypesOfResearchService) {
        super(medTypesOfResearchService);
        this.medTypesOfResearchService = medTypesOfResearchService;
    }
}
