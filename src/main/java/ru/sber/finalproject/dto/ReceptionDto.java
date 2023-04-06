package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.model.ReceptionStatus;
import ru.sber.finalproject.model.Visitor;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReceptionDto extends GenericDto {
    private VisitorDto visitor;
    private DoctorDto doctor;
    private LocalDateTime receptionDateTime;
    private ReceptionStatus receptionStatus;
}
