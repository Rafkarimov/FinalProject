package ru.sber.finalproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    @ManyToMany(mappedBy = "medTypesOfResearchList")
    private List<LaboratoryAssistant> laboratoryAssistantList = new ArrayList<>();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "modifiedBy = " + getModifiedBy() + ", " +
                "modifiedWhen = " + getModifiedWhen() + ", " +
                "title = " + getTitle() + ", " +
                "description = " + getDescription() + ")";
    }
}
