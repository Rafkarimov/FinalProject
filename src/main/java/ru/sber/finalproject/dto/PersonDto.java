package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.Authority;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto extends GenericDto {
    private String login;
    private String password;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String phone;
    private String email;
    private String snils;
    private List<Authority> authorities;
}
