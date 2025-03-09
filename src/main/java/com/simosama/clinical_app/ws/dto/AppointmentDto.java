package com.simosama.clinical_app.ws.dto;

import com.simosama.clinical_app.entities.StatusAPT;

import java.util.Date;

public class AppointmentDto {

    private Long id;
    private Date date;
    private StatusAPT statusAPT;
    private Long doctorId;
    private Long ptientId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatusAPT getStatusAPT() {
        return statusAPT;
    }

    public void setStatusAPT(StatusAPT statusAPT) {
        this.statusAPT = statusAPT;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPtientId() {
        return ptientId;
    }

    public void setPtientId(Long ptientId) {
        this.ptientId = ptientId;
    }
}
