package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.MedSpecialization;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/med-specialization")
public class MedSpecializationController extends GenericController<MedSpecialization> {
    public MedSpecializationController(GenericRepository<MedSpecialization> genericRepository) {
        super(genericRepository);
    }
}
