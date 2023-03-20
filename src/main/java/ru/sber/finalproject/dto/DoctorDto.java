package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.MedSpecialization;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto extends GenericDto {
    private MedSpecialization medSpecialization;
}
