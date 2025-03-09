package com.simosama.clinical_app.service.impl;

import com.simosama.clinical_app.Repository.ConsultationRepository;
import com.simosama.clinical_app.entities.Consultation;
import com.simosama.clinical_app.service.facade.ConsultationService;
import org.springframework.stereotype.Service;

@Service
public class ConsultationImpl implements ConsultationService {

    ConsultationRepository consultationRepository;
    public ConsultationImpl(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }
    @Override
    public Consultation addConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Consultation getConsultation(Long id) {
        if(consultationRepository.findById(id).isPresent()){
        return consultationRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public Consultation editConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
