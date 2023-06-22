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
public class PatientPojo {

    public PatientPojo(String firstName, String lastName, int age, String patientId, String gender, String marriedStatus, String address, String city, String mobileNO, Date pDate, int otp, String odp, String doctorId, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.patientId = patientId;
        this.gender = gender;
        this.marriedStatus = marriedStatus;
        this.address = address;
        this.city = city;
        this.mobileNO = mobileNO;
        this.pDate = pDate;
        this.otp = otp;
        this.odp = odp;
        this.doctorId = doctorId;
        this.status = status;
    }
    public PatientPojo(){
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getGender() {
        return gender;
    }public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public String getAddresss() {
        return address;
    }

    public void setAddresss(String addresss) {
        this.address = addresss;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getOdp() {
        return odp;
    }

    public void setOdp(String odp) {
        this.odp = odp;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String firstName;
    private String lastName;
    private int age;
    private String patientId;
    private String gender;
    private String marriedStatus;
    private String address;
    private String city;
    private String mobileNO;
    private Date pDate ;
    private int otp;
    private String odp;
    private String doctorId;
    private String status;
    
    
    
    
}
