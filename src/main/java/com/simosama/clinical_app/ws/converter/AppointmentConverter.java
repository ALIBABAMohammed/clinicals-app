package com.simosama.clinical_app.ws.converter;

import com.simosama.clinical_app.Repository.ConsultationRepository;
import com.simosama.clinical_app.Repository.DoctorRepository;
import com.simosama.clinical_app.Repository.PatientRepository;
import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.entities.Doctor;
import com.simosama.clinical_app.entities.Patient;
import com.simosama.clinical_app.ws.dto.AppointmentDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AppointmentConverter extends AbstractConverter<Appointment, AppointmentDto> {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final ConsultationRepository consultationRepository;

    public AppointmentConverter(DoctorRepository doctorRepository, PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Appointment toItem(AppointmentDto appointmentDto) {
        Appointment result = null;
        if(appointmentDto != null){
            result = new Appointment();
            result.setDate(appointmentDto.getDate());
            result.setStatusAPT(appointmentDto.getStatusAPT());
            Optional<Doctor> doctor = doctorRepository
                    .findById(appointmentDto.getDoctorId());
            if(doctor.isPresent()){
            result.setDoctor(doctor.get());
            }
            Optional<Patient> patient = patientRepository
                    .findById(appointmentDto.getPatientId());
            if(patient.isPresent()){
            result.setPatient(patient.get());
            }

        }

        return result;
    }

    @Override
    public AppointmentDto toDto(Appointment appointment) {

        AppointmentDto result = new AppointmentDto();
        if(appointment != null){
            result.setDate(appointment.getDate());
            result.setDoctorId(appointment.getDoctor().getId());
            result.setPatientId(appointment.getPatient().getId());
            result.setStatusAPT(appointment.getStatusAPT());
        }
        return result;
    }
}
