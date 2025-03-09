package com.simosama.clinical_app.service.facade;

import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();
    Patient findByLastName(String lastName);
    Patient savepatient(Patient patient);
    int deletePatient(Long id);
}
