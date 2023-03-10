package ru.sber.finalproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "visitor")
@Builder
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Visitor extends GenericModel{
}
