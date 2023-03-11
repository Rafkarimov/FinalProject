package ru.sber.finalproject.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.model.Person;
import ru.sber.finalproject.repository.GenericRepository;

@RestController
@RequestMapping("/person")
public class PersonController extends GenericController<Person> {
    public PersonController(GenericRepository<Person> genericRepository) {
        super(genericRepository);
    }
}
