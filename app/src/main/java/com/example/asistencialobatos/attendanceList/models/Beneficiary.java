package com.example.asistencialobatos.attendanceList.models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Date;

public class Beneficiary implements Serializable {

    @Expose
    private int id;

    @Expose
    private String name;

    @Expose
    private int image;

    @Expose
    private Genres genres;

    @Expose
    private int age;

    @Expose
    private String ageGroup;

    @Expose
    private String developmentStage;

    @Expose
    private Date startDate;

    @Expose
    private int attendance;

    @Expose
    private int totalAttendance;

    @Expose
    private int attendanceRate;


}
