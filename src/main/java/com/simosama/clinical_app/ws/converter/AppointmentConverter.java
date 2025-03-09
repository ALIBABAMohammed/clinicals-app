package com.simosama.clinical_app.ws.converter;

import com.simosama.clinical_app.entities.Appointment;
import com.simosama.clinical_app.ws.dto.AppointmentDto;
import org.springframework.stereotype.Component;

@Component
public class AppointmentConverter extends AbstractConverter<Appointment, AppointmentDto> {
    @Override
    public Appointment toItem(AppointmentDto appointmentDto) {
        return null;
    }

    @Override
    public AppointmentDto toDto(Appointment appointment) {
        return null;
    }
}
