package ru.sber.finalproject.cotroller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.MedSpecializationDto;
import ru.sber.finalproject.model.MedSpecialization;
import ru.sber.finalproject.service.MedSpecializationService;

@RestController
@RequestMapping("/med-specialization")
@Tag(name = "Медицинская специальность", description = "Контроллер для работы с медицинскими специальностями")
public class MedSpecializationController extends GenericController<MedSpecialization, MedSpecializationDto> {
    private final MedSpecializationService medSpecializationService;
    public MedSpecializationController(MedSpecializationService medSpecializationService) {
        super(medSpecializationService);
        this.medSpecializationService = medSpecializationService;
    }
}
