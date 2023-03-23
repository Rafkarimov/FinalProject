package ru.sber.finalproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "med_types_of_research")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MedTypesOfResearch extends GenericModel {
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

//    @ManyToMany(mappedBy = "medTypesOfResearches")
//    private Set<LaboratoryAssistant> laboratoryAssistants;
}
