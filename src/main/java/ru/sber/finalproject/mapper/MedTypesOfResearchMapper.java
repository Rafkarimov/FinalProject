package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.MedTypesOfResearchDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.MedTypesOfResearch;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MedTypesOfResearchMapper extends GenericMapper<MedTypesOfResearch, MedTypesOfResearchDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
