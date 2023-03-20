package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.MedSpecializationDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.MedSpecialization;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MedSpecializationMapper extends GenericMapper<MedSpecialization, MedSpecializationDto> {
    @Override
    void update(@MappingTarget MedSpecialization entity, MedSpecialization updateEntity);
}
