package com.simosama.clinical_app;

import com.simosama.clinical_app.Repository.AppointmentRepository;
import com.simosama.clinical_app.Repository.ConsultationRepository;
import com.simosama.clinical_app.Repository.DoctorRepository;
import com.simosama.clinical_app.Repository.PatientRepository;
import com.simosama.clinical_app.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class ClinicalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(PatientRepository patientRepository,
							DoctorRepository doctorRepository,
							AppointmentRepository appointmentRepository,
							ConsultationRepository consultationRepository
							) {
		return args -> {
			Stream.of("younes", "farid", "salah", "ali").forEach( name -> {
				Doctor doctor = new Doctor();
				doctor.setFirstName(name);
				doctor.setLastName("sama");
				doctor.setSpecialty(Math.random() > 0.5 ? "Cardio": "dentist");
				doctorRepository.save(doctor);
			});
			Stream.of("kaoutar", "zaineb", "asmae", "imad").forEach( name -> {
				Patient patient = new Patient();
				patient.setFirstName(name);
				patient.setLastName("bennani");
				patient.setAge(33);
				patientRepository.save(patient);
			});

			Patient patient = patientRepository.findByFirstName("asmae");
			Doctor doctor = doctorRepository.findByFirstName("younes");
			Appointment appointment = new Appointment();
			appointment.setDate(new Date());
			appointment.setStatusAPT(StatusAPT.PENDING);
			appointment.setPatient(patient);
			appointment.setDoctor(doctor);
			appointmentRepository.save(appointment);

			List<Appointment> appointments = new ArrayList<>(appointmentRepository.findAll());

			Stream.of(appointments).forEach(appointmente -> {
			System.out.println(appointmente.getFirst().getDate());
			System.out.println(appointmente.getFirst().getConsultation());
			System.out.println(appointmente.getFirst().getDoctor());
			System.out.println(appointmente.getFirst().getPatient());

			});

			Appointment appointment1 = appointmentRepository.findById(1L).orElse(null);

			Consultation consultation = new Consultation();

			consultation.setAppointment(appointment1);
            assert appointment1 != null;
            consultation.setConsultationDate(appointment1.getDate());
			consultation.setRapport("Perfect");
			consultationRepository.save(consultation);
		};
	};
}
