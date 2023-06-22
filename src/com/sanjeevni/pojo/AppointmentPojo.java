/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjeevni.pojo;

import java.sql.Date;

/**
 *
 * @author LENOVO
 */
public class AppointmentPojo {

    public AppointmentPojo(String patientId, String patientName, String status, String odp, String dateTime, String doctorName, String mobileNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.status = status;
        this.odp = odp;
        this.dateTime = dateTime;
        this.doctorName = doctorName;
        this.mobileNo = mobileNo;
    }
     public AppointmentPojo(){
         
     }
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOdp() {
        return odp;
    }

    public void setOdp(String odp) {
        this.odp = odp;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    private String patientId;
    private String patientName;;
    private String status;
    private String odp;
    private String dateTime;
    private String doctorName;
    private String mobileNo;
    
}
