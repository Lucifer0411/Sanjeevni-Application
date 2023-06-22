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
public class User {
    public User(){
        
    }
    public User(String loginId, String password, String UserType) {
        this.loginId = loginId;
        this.password = password;
        this.UserType = UserType;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
    private String loginId;
    private String password;
    private String UserType;
    
}
