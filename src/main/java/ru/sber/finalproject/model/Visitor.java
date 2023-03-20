package ru.sber.finalproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "visitor")
@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Visitor extends GenericModel {
}
