package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.DoctorDto;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@Tag(name = "Врач", description = "Контроллер для врача")
public class DoctorController extends GenericController<Doctor, DoctorDto> {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        super(doctorService);
        this.doctorService = doctorService;
    }
}
