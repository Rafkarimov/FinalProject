package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.PersonDto;
import ru.sber.finalproject.model.Person;
import ru.sber.finalproject.service.PersonService;

@RestController
@RequestMapping("/person")
@Tag(name = "Пользователи", description = "Контроллер для работы пользователями")
public class PersonController extends GenericController<Person, PersonDto> {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        super(personService);
        this.personService = personService;
    }
}
