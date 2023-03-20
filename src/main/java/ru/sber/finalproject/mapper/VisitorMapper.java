package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.VisitorDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.Visitor;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface VisitorMapper extends GenericMapper<Visitor, VisitorDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
