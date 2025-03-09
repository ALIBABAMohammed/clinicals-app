package com.simosama.clinical_app.service.facade;

import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Doctor;
import com.simosama.clinical_app.entities.Patient;

import java.util.Date;
import java.util.List;

public interface AppointmentService {

    List<Appointment> findAll();

    List<Appointment> findAppointmentByPatient(Patient patient);

    Appointment saveAppointment(Appointment appointment);
    List<Appointment> findAppointmentByDoctor(Doctor doctor);
    int cancelAppointment(Appointment appointment);
    Appointment getAppointmentByDate(Date date);
    Appointment addAppointmentToPatient(Appointment appointment);

}
