/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjeevni.pojo;

/**
 *
 * @author LENOVO
 */
public class ReceptionistPojo {

    public ReceptionistPojo(String receptionistname, String receptionistId, String gender) {
        this.receptionistName = receptionistname;
        this.receptionistId = receptionistId;
        this.gender = gender;
    }
public ReceptionistPojo(){
    
}
    public String getReceptionistname() {
        return receptionistName;
    }

    public void setReceptionistname(String receptionistname) {
        this.receptionistName = receptionistname;
    }

    public String getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private String receptionistName;
    private String receptionistId;
    private String gender;
    
    
}
