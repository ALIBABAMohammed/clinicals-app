package com.simosama.clinical_app.service.impl;

import com.simosama.clinical_app.Repository.AppointmentRepository;
import com.simosama.clinical_app.Repository.PatientRepository;
import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Doctor;
import com.simosama.clinical_app.entities.Patient;
import com.simosama.clinical_app.service.facade.AppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AppointmentImpl implements AppointmentService{


    AppointmentRepository appointmentRepository;
    PatientRepository patientRepository;

    public AppointmentImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> findAppointmentByPatient(Patient patient) {
        List<Appointment> appointments = appointmentRepository.findByPatient(patient);
        patient.setAppointments(appointments);
        return appointments;
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAppointmentByDoctor(Doctor doctor) {
        List<Appointment> appointments = appointmentRepository.findByDoctor(doctor);
        doctor.setAppointments(appointments);
        return appointments;
    }

    @Override
    public int cancelAppointment(Appointment appointment) {
        appointmentRepository.delete(appointment);
        return 0;
    }

    @Override
    public Appointment getAppointmentByDate(Date date) {
        return appointmentRepository.findByDate(date);
    }

    @Override
    public Appointment addAppointmentToPatient(Appointment appointment) {
        return null;
    }
}
