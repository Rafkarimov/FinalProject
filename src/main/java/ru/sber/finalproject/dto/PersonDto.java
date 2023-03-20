package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.Authority;
import ru.sber.finalproject.model.ChiefDoctor;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.model.LaboratoryAssistant;
import ru.sber.finalproject.model.Visitor;

import java.time.LocalDate;
import java.util.Set;

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
    private ChiefDoctor chiefDoctor;
    private Doctor doctor;
    private LaboratoryAssistant laboratoryAssistant;
    private Visitor visitor;
    private Set<Authority> authorities;

}
