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
@Table(name = "person")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person extends GenericModel {
    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name", nullable = false)
    private String middleName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String snils;

    @ManyToOne
    @JoinColumn(name = "chief_doctor_id", nullable = false, foreignKey = @ForeignKey(name = "chief_doctor_person_id_fkey"))
    private ChiefDoctor chiefDoctor;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false, foreignKey = @ForeignKey(name = "doctor_person_id_fkey"))
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "laboratory_assistant_id", nullable = false, foreignKey = @ForeignKey(name = "laboratory_assistant_person_id_fkey"))
    private LaboratoryAssistant laboratoryAssistant;

    @ManyToOne
    @JoinColumn(name = "visitor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_person_id_fkey"))
    private Visitor visitor;
}
