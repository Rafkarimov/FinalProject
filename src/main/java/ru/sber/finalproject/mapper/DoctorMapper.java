package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.DoctorDto;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.model.GenericModel;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DoctorMapper extends GenericMapper<Doctor, DoctorDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
