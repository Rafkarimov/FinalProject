package ru.sber.finalproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "chief_doctor_id", nullable = false, foreignKey = @ForeignKey(name = "chief_doctor_person_id_fkey"))
//    private ChiefDoctor chiefDoctor;
//
//    @OneToOne
//    @JoinColumn(name = "doctor_id", nullable = false, foreignKey = @ForeignKey(name = "doctor_person_id_fkey"))
//    private Doctor doctor;
//
//    @OneToOne
//    @JoinColumn(name = "laboratory_assistant_id", nullable = false, foreignKey = @ForeignKey(name = "laboratory_assistant_person_id_fkey"))
//    private LaboratoryAssistant laboratoryAssistant;
//
//    @OneToOne
//    @JoinColumn(name = "visitor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_person_id_fkey"))
//    private Visitor visitor;

//    @ManyToOne
//    @JoinColumn(name = "chief_doctor_id", nullable = false, foreignKey = @ForeignKey(name = "chief_doctor_person_id_fkey"))
//    private ChiefDoctor chiefDoctor;

//    @ManyToOne
//    @JoinColumn(name = "doctor_id", nullable = false, foreignKey = @ForeignKey(name = "doctor_person_id_fkey"))
//    private Doctor doctor;
//
//    @ManyToOne
//    @JoinColumn(name = "laboratory_assistant_id", nullable = false, foreignKey = @ForeignKey(name = "laboratory_assistant_person_id_fkey"))
//    private LaboratoryAssistant laboratoryAssistant;
//
//    @ManyToOne
//    @JoinColumn(name = "visitor_id", nullable = false, foreignKey = @ForeignKey(name = "visitor_person_id_fkey"))
//    private Visitor visitor;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "person_authority",
            joinColumns = @JoinColumn(name = "person_id"),
            foreignKey = @ForeignKey(name = "person_authority_authority_id_fkey"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"),
            inverseForeignKey = @ForeignKey(name = "person_authority_person_id_fkey"))
    private List<Authority> authorities = new ArrayList<>();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "login = " + login + ", " +
                "password = " + password + ", " +
                "lastName = " + lastName + ", " +
                "firstName = " + firstName + ", " +
                "middleName = " + middleName + ", " +
                "birthDate = " + birthDate + ", " +
                "phone = " + phone + ", " +
                "email = " + email + ", " +
                "snils = " + snils + ", ";
    }
}
