package ru.sber.finalproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class GenericModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "default_gen")
    @SequenceGenerator(name = "default_gen", sequenceName = "default_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name = "created_by", nullable = false, updatable = false)
    @CreatedBy
    @JsonIgnore
    protected String createdBy;

    @Column(name = "created_when", nullable = false, updatable = false)
    @CreatedDate
    @JsonIgnore
    protected LocalDateTime createdWhen;

    @Column(name = "modified_by", nullable = false)
    @LastModifiedBy
    @JsonIgnore
    private String modifiedBy;

    @Column(name = "modified_when", nullable = false)
    @LastModifiedDate
    @JsonIgnore
    private LocalDateTime modifiedWhen;
}
