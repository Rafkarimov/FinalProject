package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.ChiefDoctorDto;
import ru.sber.finalproject.model.ChiefDoctor;
import ru.sber.finalproject.model.GenericModel;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ChiefDoctorMapper extends GenericMapper<ChiefDoctor, ChiefDoctorDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
