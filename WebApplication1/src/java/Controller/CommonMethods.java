/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserDB;
import java.sql.Date;

/**
 *
 * @author mac
 */
public class CommonMethods {

    public CommonMethods() {
    }

    public User login(String phone_number, String pass_word) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.login(phone_number, pass_word);
        if (user != null) {
            return user;
        }
        return null;
    }

    public boolean register(int userId, String fullName, Date dob, boolean gender, String phoneNumber, 
            String passWord, String email, String address, String role, String detail) throws Exception {
        UserDB userDB = new UserDB();
        User user = new User(userId, fullName, dob, gender, phoneNumber, passWord, email, address, role, detail);
        boolean result = userDB.addUser(user);
    if (result){
        return true;
    }
        return false;
    }
    
    public User viewInfo(String phoneNumber){
        UserDB userDB = new UserDB();
        User user = userDB.getInfoByPhone(phoneNumber);
        return user;
    }
}
