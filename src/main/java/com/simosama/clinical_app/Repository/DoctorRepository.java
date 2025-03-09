package com.simosama.clinical_app.Repository;

import com.simosama.clinical_app.entities.Doctor;
import com.simosama.clinical_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findByFirstName(String firstName);
    Doctor findByLastName(String lastName);

}
