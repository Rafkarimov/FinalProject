package ru.sber.finalproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "authority")
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Authority extends GenericModel {
//    @ManyToMany(mappedBy = "authorities")
//    private Set<Person> personSet;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "modifiedBy = " + getModifiedBy() + ", " +
                "modifiedWhen = " + getModifiedWhen() + ")";
    }
}
