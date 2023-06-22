/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import com.sanjeevni.dao.EmpDao;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class CheckReceptionistList {
    public static void main(String [] args)throws SQLException{
        Map<String,String> list=EmpDao.getUnregisterReceptionists();
        int l=list.size();
        System.out.println("l:"+l);
        Set<String> id=list.keySet();
        for(String i:id){
            System.out.println(i);
        }
        
        
    }
    
}
