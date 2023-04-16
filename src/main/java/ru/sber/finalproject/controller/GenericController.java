package ru.sber.finalproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import ru.sber.finalproject.dto.GenericDto;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.service.GenericService;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
public abstract class GenericController<E extends GenericModel, D extends GenericDto>  {
    private final GenericService<E, D> genericService;

    protected GenericController(GenericService<E, D> genericService) {
        this.genericService = genericService;
    }

    @Operation(description = "Получить запись по ID", method = "getById")
    @GetMapping("/getById/{id}")
    public ResponseEntity<D> getById(@PathVariable(value = "id") Long id) {
        return genericService.findById(id)
                .map(entity -> ResponseEntity.status(OK).body(entity))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @Operation(description = "Получить все записи", method = "getAll")
    @GetMapping("/get-all")
    public ResponseEntity<List<D>> getAll() {
        return ResponseEntity.ok(genericService.listAll());
    }

    @Operation(description = "Создать новую запись", method = "create")
    @PostMapping("/create")
    public ResponseEntity<D> create(@RequestBody D newDto) throws InterruptedException {
        if (newDto.getId() != null && genericService.existsById(newDto.getId())) {
            log.warn("Failed to create {} with id {}, because it already exists", newDto.getClass().getSimpleName(),
                    newDto.getId());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        D result = genericService.create(newDto);
//        TimeUnit.SECONDS.sleep(10L); // Поставить в спячку
//        if (1 > 0) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Exception");
//        }
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @Operation(description = "Обновить запись", method = "update")
    @PutMapping("/update")
    public ResponseEntity<D> update(@RequestBody D updatedEntity) {
        return genericService.update(updatedEntity)
                .map(dto -> ResponseEntity.status(HttpStatus.OK).body(dto))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @Operation(description = "Удалить запись по ID", method = "delete")
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable(value = "id") Long id) {
        if (!genericService.existsById(id)) {
            log.warn("Couldn't delete entity with id {}", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        genericService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}


