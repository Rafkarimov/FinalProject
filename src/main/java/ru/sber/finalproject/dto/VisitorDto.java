package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.Person;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VisitorDto extends GenericDto {
    private PersonDto person;
}
