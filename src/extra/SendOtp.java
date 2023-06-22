/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SendOtp {
    public static void main(String [] args){
        try{
            Unirest.setTimeouts(0, 0);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter mobile no:");
            String mobNo=sc.next();
            int otp=1000+((int)(Math.random()*999));
            System.out.println("num:"+mobNo+" ,otp:"+otp);
            String url="https://2factor.in/API/V1/c0469682-aba9-11ed-813b-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
            GetRequest gr=Unirest.get(url);
            HttpResponse<String> response=gr.asString();
            String result=response.getBody();
            System.out.println(result);
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
