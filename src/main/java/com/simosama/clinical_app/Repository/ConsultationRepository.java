package com.simosama.clinical_app.Repository;

import com.simosama.clinical_app.entities.Consultation;
import com.simosama.clinical_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
