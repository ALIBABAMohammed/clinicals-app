package com.simosama.clinical_app.Repository;

import com.simosama.clinical_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByFirstName(String firstName);
    Patient findByLastName(String lastName);

}
