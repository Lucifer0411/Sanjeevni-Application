/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjeevni.pojo;

/**
 *
 * @author LENOVO
 */public class EmpPojo {

    public EmpPojo(String EmpId, String EmpName, String EmpDepartment, double EmpSal) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpDepartment = EmpDepartment;
        this.EmpSal = EmpSal;
    }
    public EmpPojo(){
        
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEmpDepartment() {
        return EmpDepartment;
    }

    public void setEmpDepartment(String EmpDepartment) {
        this.EmpDepartment = EmpDepartment;
    }

    public double getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(double EmpSal) {
        this.EmpSal = EmpSal;
    }
    private String EmpId;
    private String EmpName;
    private String EmpDepartment;
    private double EmpSal;
    
}
