/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import utility.OTPSender;

/**
 *
 * @author LENOVO
 */
public class DateFormatExample extends OTPSender{
    public static void main(String [] args)throws ParseException
    {
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/YYYY");
        String datestr=sdf.format(today);
        System.out.println(datestr);
        System.out.println("today:"+today.getTime());
        //convert date to sql format
        java.util.Date d1=sdf.parse(datestr);
        long ms=d1.getTime();
        java.sql.Date d2=new java.sql.Date(ms);
        System.out.println(d2);
        
        
    }
    
}
