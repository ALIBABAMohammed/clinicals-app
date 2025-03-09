package com.simosama.clinical_app.service.facade;

import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor getdoctor(Doctor doctor);
    List<Doctor> findAll();
    int deleteDoctor(Doctor doctor);
    Doctor getDoctorByLastName(String lastName);
    Doctor addDoctor(Doctor doctor);
    Doctor addAppointmentToDoctor(Appointment appointment);
}
