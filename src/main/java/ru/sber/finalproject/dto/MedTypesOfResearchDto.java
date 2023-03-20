package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.LaboratoryAssistant;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MedTypesOfResearchDto extends GenericDto {
    private String title;
    private String description;
    private Set<LaboratoryAssistant> laboratoryAssistantSet;
}
