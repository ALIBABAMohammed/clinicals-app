package com.simosama.clinical_app.ws.converter;

import com.simosama.clinical_app.entities.Patient;
import com.simosama.clinical_app.ws.dto.PatientDto;

public class PatientConverter extends AbstractConverter<Patient, PatientDto>{

    @Override
    public Patient toItem(PatientDto patientDto) {
        Patient result = null;
        if(patientDto != null) {
            result = new Patient();
            result.setLastName(patientDto.getLastName());
            result.setAge(patientDto.getAge());
            result.setFirstName(patientDto.getFirstName());
        }
        return result;
    }

    @Override
    public PatientDto toDto(Patient patient) {
        PatientDto result = null;
        if(patient != null) {
            result = new PatientDto();
            result.setAge(patient.getAge());
            result.setLastName(patient.getLastName());
            result.setFirstName(patient.getFirstName());
        }
        return result;
    }
}
