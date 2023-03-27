package ru.sber.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.finalproject.model.Person;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LaboratoryAssistantDto extends GenericDto {
    private Person person;
    private List<MedTypesOfResearchDto> medTypesOfResearchList;
    private List<VisitorResearchDto> visitorResearchList;
}
