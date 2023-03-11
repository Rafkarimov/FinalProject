package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.Reception;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/reception")
public class ReceptionController extends GenericController<Reception> {
    public ReceptionController(GenericRepository<Reception> genericRepository) {
        super(genericRepository);
    }
}
