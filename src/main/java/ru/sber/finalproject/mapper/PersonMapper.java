package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.PersonDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.Person;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PersonMapper extends GenericMapper<Person, PersonDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
