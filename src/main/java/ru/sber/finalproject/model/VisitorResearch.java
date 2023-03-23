package ru.sber.finalproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "visitor_research")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VisitorResearch extends GenericModel {
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "visitor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_visitor_id_fkey"))
    private Visitor visitor;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "doctor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_doctor_id_fkey"))
    private Doctor doctor;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "laboratory_assistant_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_laboratory_assistant_id_fkey"))
    private LaboratoryAssistant laboratoryAssistant;

    @Column(name = "date_of_referral_for_research", nullable = false)
    private LocalDate dateOfReferralForResearch;

    @Column(name = "date_of_research", nullable = false)
    private LocalDate dateOfResearch;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "med_types_of_research_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_med_types_of_research_id_fkey"))
    private MedTypesOfResearch medTypesOfResearch;
}
