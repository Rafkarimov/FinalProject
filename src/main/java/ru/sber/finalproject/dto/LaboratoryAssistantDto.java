package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.MedTypesOfResearch;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LaboratoryAssistantDto extends GenericDto {
    private Set<MedTypesOfResearch> medTypesOfResearch;

}
