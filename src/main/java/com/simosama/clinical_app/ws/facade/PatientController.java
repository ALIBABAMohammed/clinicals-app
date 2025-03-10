package com.simosama.clinical_app.ws.facade;

import com.simosama.clinical_app.entities.Patient;
import com.simosama.clinical_app.service.facade.PatientService;
import com.simosama.clinical_app.ws.converter.PatientConverter;
import com.simosama.clinical_app.ws.dto.PatientDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/clinicals")
@Controller
public class PatientController {

    private final PatientService patientService;
    private final PatientConverter patientConverter;

    public PatientController(PatientService patientService, PatientConverter patientConverter) {
        this.patientService = patientService;
        this.patientConverter = patientConverter;
    }

    @PostMapping("/")
    public Patient savePatient(@RequestBody PatientDto patientDto){
        Patient patient = patientConverter.toItem(patientDto);
        return patientService.savepatient(patient);
    }
    @GetMapping("/patients")
    List<PatientDto> getAllPatient(){
        List<Patient> patients = patientService.findAll();
        return patientConverter.toDto(patients);
    }
    @GetMapping("/patients/{id}")
    PatientDto getSinglePatient(@PathVariable Long id){
        Patient patient = patientService.findById(id);
        return patientConverter.toDto(patient);
    }
    @DeleteMapping("/patients/delete/{id}")
    int deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return 1;
    }
}
