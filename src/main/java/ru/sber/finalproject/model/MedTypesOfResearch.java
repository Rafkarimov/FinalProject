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

import java.util.Set;

@Entity
@Table(name = "chief_doctor")
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

    @ManyToMany(mappedBy = "medTypesOfResearch")
    private Set<LaboratoryAssistant> laboratoryAssistantSet;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "modifiedBy = " + getModifiedBy() + ", " +
                "modifiedWhen = " + getModifiedWhen() + ", " +
                "title = " + getTitle() + ", " +
                "description = " + getDescription() + ")";
    }
}
