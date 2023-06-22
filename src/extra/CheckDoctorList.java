/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import com.sanjeevni.dao.DoctorDao;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class CheckDoctorList {
    public static void main(String [] arsg)throws SQLException{
        System.out.println(DoctorDao.getAllDoctors());
    }
    
}
