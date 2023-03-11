package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.Visitor;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/visitor")
public class VisitorController extends GenericController<Visitor> {
    public VisitorController(GenericRepository<Visitor> genericRepository) {
        super(genericRepository);
    }
}
