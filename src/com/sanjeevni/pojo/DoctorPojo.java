/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjeevni.pojo;

/**
 *
 * @author LENOVO
 */public class DoctorPojo {

    public DoctorPojo(String docId, String DocName, String emailId, String contactNo, String qualifications, String gender, String specialist) {
        this.docId = docId;
        this.DocName = DocName;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.qualifications = qualifications;
        this.gender = gender;
        this.specialist = specialist;
    }
    public DoctorPojo(){
        
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
    private String docId;
    private String DocName;
    private String emailId;
    private String contactNo;
    private String qualifications;
    private String gender;
    private String specialist;
    
    
    
}
