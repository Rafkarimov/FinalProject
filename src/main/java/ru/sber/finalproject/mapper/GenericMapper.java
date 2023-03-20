package ru.sber.finalproject.mapper;

import org.mapstruct.MappingTarget;

import java.util.List;

public interface GenericMapper<E, D> {
    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDTO(List<E> entityList);

    void update(@MappingTarget E entity, E updateEntity);
}
