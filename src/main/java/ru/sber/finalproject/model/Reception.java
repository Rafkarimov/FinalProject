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

import java.time.LocalDateTime;

@Entity
@Table(name = "reception")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Reception extends GenericModel {
    @ManyToOne
    @JoinColumn(name = "visitor_id", nullable = false, foreignKey = @ForeignKey(name = "reception_visitor_id_fkey"))
    private Visitor visitor;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false, foreignKey = @ForeignKey(name = "reception_doctor_id_fkey"))
    private Doctor doctor;

    @Column(name = "reception_date_time", nullable = false)
    private LocalDateTime receptionDateTime;

    @ManyToOne
    @JoinColumn(name = "reception_status_id", nullable = false, foreignKey = @ForeignKey(name = "reception_reception_status_id_fkey"))
    private ReceptionStatus receptionStatus;
}
