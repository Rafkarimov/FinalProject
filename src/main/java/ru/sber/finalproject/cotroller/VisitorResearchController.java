package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.VisitorResearch;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/visitor-research")
public class VisitorResearchController extends GenericController<VisitorResearch> {
    public VisitorResearchController(GenericRepository<VisitorResearch> genericRepository) {
        super(genericRepository);
    }
}
