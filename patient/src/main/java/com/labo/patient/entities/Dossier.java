package com.labo.patient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "dossier")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numDossier;

    @OneToOne
    @JoinColumn(name = "patient_id", nullable = false, unique = true)
    private Patient patient;
    private LocalDate date; //autogenereate

    public Long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Long numDossier) {
        this.numDossier = numDossier;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}