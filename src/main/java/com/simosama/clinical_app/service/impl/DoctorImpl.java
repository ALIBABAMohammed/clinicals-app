package com.simosama.clinical_app.service.impl;

import com.simosama.clinical_app.Repository.DoctorRepository;
import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Doctor;
import com.simosama.clinical_app.service.facade.DoctorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class DoctorImpl implements DoctorService {

    DoctorRepository doctorRepository;
    public DoctorImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor getdoctor(Doctor doctor) {
        return doctorRepository.findByLastName(doctor.getLastName());
    }

    @Override
    public List<Doctor> findAll() {
        return null;
    }

    @Override
    public int deleteDoctor(Doctor doctor) {
        doctorRepository.delete(doctor);
        return 0;
    }

    @Override
    public Doctor getDoctorByLastName(String lastName) {
        return doctorRepository.findByLastName(lastName);
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor addAppointmentToDoctor(Appointment appointment) {
        return null;
    }
}
