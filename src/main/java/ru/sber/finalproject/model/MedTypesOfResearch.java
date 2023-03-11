package ru.sber.finalproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "chief_doctor")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MedTypesOfResearch extends GenericModel{
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @ManyToMany(mappedBy = "medTypesOfResearch")
    private Set<LaboratoryAssistant> laboratoryAssistantSet;


}
