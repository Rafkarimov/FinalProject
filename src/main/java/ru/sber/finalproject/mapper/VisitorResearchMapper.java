package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.VisitorResearchDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.VisitorResearch;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface VisitorResearchMapper extends GenericMapper<VisitorResearch, VisitorResearchDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
