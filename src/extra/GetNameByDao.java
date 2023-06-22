/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import com.sanjeevni.dao.UserDao;
import com.sanjeevni.pojo.User;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class GetNameByDao {
    public static void main(String [] args){
        User user=new User();
        user.setLoginId("103345");
        user.setPassword("pass");
        user.setUserType("admin");
        try{
        UserDao.validategetUser(user);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
