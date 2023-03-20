package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.webjars.NotFoundException;
import ru.sber.finalproject.dto.GenericDto;
import ru.sber.finalproject.mapper.GenericMapper;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.repository.GenericRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Transactional(readOnly = true)
public abstract class GenericService<E extends GenericModel, D extends GenericDto> {
    private final GenericRepository<E> genericRepository;
    private final GenericMapper<E, D> genericMapper;

    protected GenericService(GenericRepository<E> genericRepository, GenericMapper<E, D> genericMapper) {
        this.genericRepository = genericRepository;
        this.genericMapper = genericMapper;
    }

    public List<D> listAll() {
        List<E> results = genericRepository.findAll();
        return genericMapper.toDTO(results);
    }

    public E getOne(Long id) {
        return genericRepository.findById(id).orElseThrow(() -> {
            log.error("{} с id = {} не найден", getModelName(), id);
            return new NotFoundException(null);
        });
    }

    @Transactional
    public D create(D dto) {
        E entity = genericMapper.toEntity(dto);
        entity = genericRepository.save(entity);
        log.info("Successfully created {} with id {}", getModelName(), dto.getId());
        return genericMapper.toDTO(entity);
    }

    @Transactional
    public E create(E entity) {
        entity = genericRepository.save(entity);
        log.info("Successfully created {} with id {}", getModelName(), entity.getId());
        return entity;
    }

    @Transactional
    public Optional<D> update(D dto) {
        Optional<E> optional = genericRepository.findById(dto.getId());
        if (optional.isPresent()) {
            E entity = optional.get();
            E updateEntity = genericMapper.toEntity(dto);
            genericMapper.update(entity, updateEntity);
            log.info("Successfully updated {} with id {}", getModelName(), entity.getId());
            entity = genericRepository.save(entity);
            return Optional.of(genericMapper.toDTO(entity));
        }
        log.info("Failed to find {} with id {}", getModelName(), dto.getId());
        return Optional.empty();
    }

    @Transactional
    public void deleteById(Long id) {
        genericRepository.deleteById(id);
        log.info("Successfully deleted {} with id {}", getModelName(), id);
    }

    public List<E> findByCreatedBy(String createdBy) {
        return genericRepository.findByCreatedBy(createdBy);
    }

    public boolean existsById(Long id) {
        return genericRepository.existsById(id);
    }

    public Optional<D> findById(Long id) {
        Optional<E> result = genericRepository.findById(id);
        return result.map(genericMapper::toDTO);
    }

    private String getModelName() {
        return this.getClass().getSimpleName().replace("Service", "");
    }
}
