package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.PersonDto;
import ru.sber.finalproject.mapper.PersonMapper;
import ru.sber.finalproject.model.Person;
import ru.sber.finalproject.repository.PersonRepository;

@Slf4j
@Service
public class PersonService extends GenericService<Person, PersonDto> {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        super(personRepository, personMapper);
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }
}
