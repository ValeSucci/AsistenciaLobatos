package com.example.asistencialobatos.attendanceList.models;

import com.google.gson.annotations.Expose;

import java.util.Date;

public class Attendance {

    @Expose
    private int idAttendance;

    @Expose
    private int idBeneficiary;

    @Expose
    private Date date;

    @Expose
    private TypeAttendance status;

    @Expose
    private String activity;

    @Expose
    private String observation;

    public Attendance(int idAttendance, int idBeneficiary, Date date, TypeAttendance status, String activity, String observation) {
        this.idAttendance = idAttendance;
        this.idBeneficiary = idBeneficiary;
        this.date = date;
        this.status = status;
        this.activity = activity;
        this.observation = observation;
    }

    public int getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(int idAttendance) {
        this.idAttendance = idAttendance;
    }

    public int getIdBeneficiary() {
        return idBeneficiary;
    }

    public void setIdBeneficiary(int idBeneficiary) {
        this.idBeneficiary = idBeneficiary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeAttendance getStatus() {
        return status;
    }

    public void setStatus(TypeAttendance status) {
        this.status = status;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
