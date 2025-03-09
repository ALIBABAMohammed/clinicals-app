package com.simosama.clinical_app.service.impl;

import com.simosama.clinical_app.Repository.AppointmentRepository;
import com.simosama.clinical_app.Repository.PatientRepository;
import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Patient;
import com.simosama.clinical_app.service.facade.PatientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
    @Override
    public Patient findByLastName(String lastName) {

        return patientRepository.findByLastName(lastName);
    }
    @Override
    public Patient savepatient(Patient patient) {

        return patientRepository.save(patient);
    }
    @Override
    public int deletePatient(Long id) {
        patientRepository.deleteById(id);
        return 0;
    }

}
