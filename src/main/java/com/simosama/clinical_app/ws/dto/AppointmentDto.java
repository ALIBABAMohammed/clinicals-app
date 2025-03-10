package com.simosama.clinical_app.ws.dto;

import com.simosama.clinical_app.entities.StatusAPT;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class AppointmentDto {

    private Long id;
    private Date date;
    private StatusAPT statusAPT;
    private Long doctorId;
    private Long patientId;


}
