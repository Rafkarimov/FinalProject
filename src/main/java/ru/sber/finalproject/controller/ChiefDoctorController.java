package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.ChiefDoctorDto;
import ru.sber.finalproject.model.ChiefDoctor;
import ru.sber.finalproject.service.ChiefDoctorService;

@RestController
@RequestMapping("/chiefdoctor")
@Tag(name = "Главный врач", description = "Контроллер для главного врача")
public class ChiefDoctorController extends GenericController<ChiefDoctor, ChiefDoctorDto> {
    private final ChiefDoctorService chiefDoctorService;

    public ChiefDoctorController(ChiefDoctorService chiefDoctorService) {
        super(chiefDoctorService);
        this.chiefDoctorService = chiefDoctorService;
    }
}
