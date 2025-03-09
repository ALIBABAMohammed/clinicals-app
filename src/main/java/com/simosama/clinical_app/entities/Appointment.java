package com.simosama.clinical_app.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Setter
@Getter
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Transactional
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private StatusAPT statusAPT;
    @ManyToOne
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    @OneToOne(mappedBy = "appointment")
    private Consultation consultation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatusAPT getStatusAPT() {
        return statusAPT;
    }

    public void setStatusAPT(StatusAPT statusAPT) {
        this.statusAPT = statusAPT;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
