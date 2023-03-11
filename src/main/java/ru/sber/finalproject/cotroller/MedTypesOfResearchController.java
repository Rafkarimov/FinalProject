package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.MedTypesOfResearch;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/med-types-of-research")
public class MedTypesOfResearchController extends GenericController<MedTypesOfResearch> {
    public MedTypesOfResearchController(GenericRepository<MedTypesOfResearch> genericRepository) {
        super(genericRepository);
    }
}
