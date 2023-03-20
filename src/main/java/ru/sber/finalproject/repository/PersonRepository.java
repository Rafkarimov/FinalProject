package ru.sber.finalproject.repository;

import org.springframework.stereotype.Repository;
import ru.sber.finalproject.model.Person;
@Repository
public interface PersonRepository extends GenericRepository<Person> {
}
