package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.ReceptionStatus;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/reception-status")
public class ReceptionStatusController extends GenericController<ReceptionStatus> {
    public ReceptionStatusController(GenericRepository<ReceptionStatus> genericRepository) {
        super(genericRepository);
    }
}
