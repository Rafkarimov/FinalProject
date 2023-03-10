package ru.sber.finalproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "laboratory_assistant")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LaboratoryAssistant extends GenericModel{

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "laboratory_assistant_med_types",
            joinColumns = @JoinColumn(name = "laboratory_assistant_id"),
            foreignKey = @ForeignKey(name = "laboratory_assistant_med_types_laboratory_assistant_id_fkey"),
            inverseJoinColumns = @JoinColumn(name = "med_types_of_research_id"),
            inverseForeignKey = @ForeignKey(name = "laboratory_assistant_med_types_med_types_of_research_id_fkey"))
    private Set<MedTypesOfResearch> medTypesOfResearch;

}
