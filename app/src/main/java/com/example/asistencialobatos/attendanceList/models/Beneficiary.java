package com.example.asistencialobatos.attendanceList.models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Date;

public class Beneficiary implements Serializable {

    @Expose
    private int idBeneficiary;

    @Expose
    private String name;

    @Expose
    private int image;

    @Expose
    private Genres genre;

    @Expose
    private Date dateOfBirth;

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

    public Beneficiary(int idBeneficiary, String name, int image, Genres genre, Date dateOfBirth, int age, String ageGroup, String developmentStage, Date startDate, int attendance, int totalAttendance, int attendanceRate) {
        this.idBeneficiary = idBeneficiary;
        this.name = name;
        this.image = image;
        this.genre = genre;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.ageGroup = ageGroup;
        this.developmentStage = developmentStage;
        this.startDate = startDate;
        this.attendance = attendance;
        this.totalAttendance = totalAttendance;
        this.attendanceRate = attendanceRate;
    }

    public int getIdBeneficiary() {
        return idBeneficiary;
    }

    public void setIdBeneficiary(int idBeneficiary) {
        this.idBeneficiary = idBeneficiary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getDevelopmentStage() {
        return developmentStage;
    }

    public void setDevelopmentStage(String developmentStage) {
        this.developmentStage = developmentStage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getTotalAttendance() {
        return totalAttendance;
    }

    public void setTotalAttendance(int totalAttendance) {
        this.totalAttendance = totalAttendance;
    }

    public int getAttendanceRate() {
        return attendanceRate;
    }

    public void setAttendanceRate(int attendanceRate) {
        this.attendanceRate = attendanceRate;
    }
}
