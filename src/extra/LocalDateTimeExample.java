/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class LocalDateTimeExample {
    //this class comes java 8 onward use to compare dates 
    
    //also use for performing calculation on date
    public static void main(String [] args){
//        LocalDateTime ldt=LocalDateTime.now();
//        System.out.println(ldt);
        Date d=new Date();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");
        DateTimeFormatter obj=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDateTime ldt=LocalDateTime.parse(d.toString(), dtf);
        System.out.println(ldt);
        String str=ldt.format(obj);
        System.out.println(str);
    }
    
}
//Points about LocalDateTime
//1. This class belong to the package java.time and is newly introduced from java 8 onwards
//2. This class belongs to joda api(java date api )which was also introduced java 8 onwards
//3. The class has all constuctors are declared as private and so we have to use its static factory methods to create its objects
//4. Three of its most important methods are :
//i.   now() = which is a static method which returns object of LocalDateTime class initialize with current data and time in UTC format
//ii.  parse() = It is a static method which accepts two arguments a string representing date and time ,second is object representing format of date and time 
//iii  format() = It is also a static method which accepts a DateTimeFormatter object as argument containing a String in which we want to convert the LocatDateTime object     
