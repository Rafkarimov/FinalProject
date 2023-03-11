package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.LaboratoryAssistant;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/laboratory-assistant")
public class LaboratoryAssistantController extends GenericController<LaboratoryAssistant> {
    public LaboratoryAssistantController(GenericRepository<LaboratoryAssistant> genericRepository) {
        super(genericRepository);
    }
}
