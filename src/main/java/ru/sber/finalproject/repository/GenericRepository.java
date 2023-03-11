package ru.sber.finalproject.repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import ru.sber.finalproject.model.GenericModel;

import java.util.List;

@NoRepositoryBean
@Hidden
public interface GenericRepository<T extends GenericModel> extends JpaRepository<T, Long> {
    List<T> findByCreatedBy(String createdBy);

    @Query(value = "SELECT m FROM #{#entityName} m ORDER BY id DESC")
    List<T> findAllSortedByIdDesc(); // название метода произвольное

    List<T> findAllByOrderByIdDesc(); // название метода строго по правилам JPA
}
