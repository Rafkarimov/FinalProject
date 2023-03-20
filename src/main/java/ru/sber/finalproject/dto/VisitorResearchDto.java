package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.Doctor;
import ru.sber.finalproject.model.LaboratoryAssistant;
import ru.sber.finalproject.model.MedTypesOfResearch;
import ru.sber.finalproject.model.Visitor;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VisitorResearchDto extends GenericDto {
    private Visitor visitor;
    private Doctor doctor;
    private LaboratoryAssistant laboratoryAssistant;
    private LocalDate dateOfReferralForResearch;
    private LocalDate dateOfStudy;
    private MedTypesOfResearch medTypesOfResearch;
}
