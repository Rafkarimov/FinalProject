package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.LaboratoryAssistantDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.LaboratoryAssistant;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface LaboratoryAssistantMapper extends GenericMapper<LaboratoryAssistant, LaboratoryAssistantDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
