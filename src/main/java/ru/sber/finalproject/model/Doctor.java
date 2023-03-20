package ru.sber.finalproject.model;

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

@Entity
@Table(name = "doctor")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Doctor extends GenericModel {
    @ManyToOne
    @JoinColumn(name = "med_specialization_id", nullable = false, foreignKey = @ForeignKey(name = "doctor_med_specialization_id_fkey"))
    private MedSpecialization medSpecialization;
}
