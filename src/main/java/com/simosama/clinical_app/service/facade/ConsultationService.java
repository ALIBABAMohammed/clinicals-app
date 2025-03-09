package com.simosama.clinical_app.service.facade;

import com.simosama.clinical_app.entities.Consultation;

public interface ConsultationService {

    Consultation addConsultation(Consultation consultation);
    Consultation getConsultation(Long id);
    Consultation editConsultation(Consultation consultation);

}
