package ru.sber.finalproject.model;

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
    @ManyToOne
    @JoinColumn(name = "visitor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_visitor_id_fkey"))
    private Visitor visitor;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_doctor_id_fkey"))
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "laboratory_assistant_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_laboratory_assistant_id_fkey"))
    private LaboratoryAssistant laboratoryAssistant;

    @Column(name = "date_of_referral_for_research", nullable = false)
    private LocalDate dateOfReferralForResearch;

    @Column(name = "date_of_study", nullable = false)
    private LocalDate dateOfStudy;

    @ManyToOne
    @JoinColumn(name = "med_types_of_research_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_research_med_types_of_research_id_fkey"))
    private MedTypesOfResearch medTypesOfResearch;
}
