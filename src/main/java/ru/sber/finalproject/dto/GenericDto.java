package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class GenericDto {
    protected Long id;
//    protected LocalDateTime createdWhen = LocalDateTime.now();
//    protected String createdBy = "DEFAULT_USER";
}
