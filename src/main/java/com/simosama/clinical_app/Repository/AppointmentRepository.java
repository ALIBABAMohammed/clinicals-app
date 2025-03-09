package com.simosama.clinical_app.Repository;

import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Doctor;
import com.simosama.clinical_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatient(Patient patient);
    Appointment findByDate(Date date);

    List<Appointment> findByDoctor(Doctor doctor);
}
