/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

/**
 *
 * @author LENOVO
 */
public class OTPSender implements Sender {

    @Override//first need to throws exception handle by interface if abstact
    public boolean send(String number, String data) throws UnirestException{
//        System.out.println(System.getProperties());
//        System.out.println(System.getProperty("java.classpath"));
//            Unirest.setTimeouts(0, 0);
//            String mobNo=number;
//            int otp=Integer.parseInt(data);
//            String url="https://2factor.in/API/V1/8be2cc48-b128-11ed-8136-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
//            GetRequest gr=Unirest.get(url);
//            HttpResponse<String> response=gr.asString();
//            String result=response.getBody();
//            return result.contains("Success");
            
             Unirest.setTimeouts(0, 0);
            String mobNo=number;
            int otp=Integer.parseInt(data);
            String url = "https://2factor.in/API/V1/8be2cc48-b128-11ed-8136-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
            System.out.println("OTP is:"+otp);
            GetRequest gr=Unirest.get(url);
            System.out.println("gr:"+gr);
            HttpResponse<String>response=gr.asString();
            System.out.println("response:"+response);
            String result=response.getBody();
            System.out.println("string:"+result);
            return result.contains("Success");
    }
    
}
