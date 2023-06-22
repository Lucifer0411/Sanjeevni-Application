/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import com.sanjeevni.dbutil.PasswordEncryption;

/**
 *
 * @author LENOVO
 */
public class DecryptPass {
    public static void main(String [] args){
        String pass=PasswordEncryption.getDecryptedPassword("NDU0NQ==");
        System.out.println(pass);
    }
    
}
