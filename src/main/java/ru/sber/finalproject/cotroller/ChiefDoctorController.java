package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.ChiefDoctor;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/chief-doctor")
public class ChiefDoctorController extends GenericController<ChiefDoctor> {
    public ChiefDoctorController(GenericRepository<ChiefDoctor> genericRepository) {
        super(genericRepository);
    }
}
