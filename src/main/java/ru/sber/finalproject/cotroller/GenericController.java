package ru.sber.finalproject.cotroller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.sber.finalproject.model.GenericModel;
import ru.sber.finalproject.repository.GenericRepository;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RequiredArgsConstructor
public abstract class GenericController<T extends GenericModel> {
    private final GenericRepository<T> genericRepository;

    @Operation(description = "Получить запись по ID", method = "getById")
    @GetMapping("/getById/{id}")
    public ResponseEntity<T> getById(@PathVariable(value = "id") Long id) {
        return genericRepository.findById(id)
                .map(entity -> ResponseEntity.status(OK).body(entity))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @Operation(description = "Получить все записи", method = "getAll")
    @GetMapping("/getAll")
    public ResponseEntity<List<T>> getAll() {
        return ResponseEntity.ok(genericRepository.findAllSortedByIdDesc());
    }

    @Operation(description = "Создать новую запись", method = "create")
    @PostMapping("/create")
    public ResponseEntity<T> create(@RequestBody T newEntity) {
        if (newEntity.getId() != null && genericRepository.existsById(newEntity.getId())) {
            log.warn("Failed to create " + newEntity.getClass().getSimpleName() + " with id {}, because it already exists", newEntity.getId());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        T result = genericRepository.save(newEntity);
        log.info("Successfully created " + newEntity.getClass().getSimpleName() + " with id {}", result.getId());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @Operation(description = "Обновить запись", method = "update")
    @PutMapping("/update")
    public ResponseEntity<T> update(@RequestBody T updatedEntity) {
        return genericRepository.findById(updatedEntity.getId())
                .map((GenericModel entity) -> {
                    genericRepository.save(updatedEntity);
                    log.info("Successfully updated entity with id {}", updatedEntity.getId());
                    return ResponseEntity
                            .status(HttpStatus.OK)
                            .body(genericRepository.save(updatedEntity));
                })
                .orElseGet(() -> {
                    log.warn("Couldn't find entity with id {}", updatedEntity.getId());
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                });
    }

    @Operation(description = "Удалить запись по ID", method = "delete")
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable(value = "id") Long id) {
        if (!genericRepository.existsById(id)) {
            log.warn("Couldn't delete entity with id {}", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        genericRepository.deleteById(id);
        log.info("Successfully deleted entity with id {}", id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}


