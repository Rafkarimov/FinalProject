package ru.sber.finalproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.sber.finalproject.dto.ReceptionDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.model.Reception;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ReceptionMapper extends GenericMapper<Reception, ReceptionDto> {
    void update(@MappingTarget GenericModel entity, GenericModel updateEntity);
}
