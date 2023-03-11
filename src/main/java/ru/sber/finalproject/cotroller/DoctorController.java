package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/doctor")
public class DoctorController extends GenericController<Doctor> {
    public DoctorController(GenericRepository<Doctor> genericRepository) {
        super(genericRepository);
    }
}
