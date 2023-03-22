package ru.sber.finalproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "chief_doctor")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ChiefDoctor extends GenericModel {
    @OneToOne
    private Person person;

    @ManyToOne
    @JoinColumn(name = "med_specialization_id", nullable = false, foreignKey = @ForeignKey(name = "chief_doctor_med_specialization_id_fkey"))
    private MedSpecialization medSpecialization;

//    @OneToMany (mappedBy = "chiefDoctor")
//    private Set<Person> personSet;
}
