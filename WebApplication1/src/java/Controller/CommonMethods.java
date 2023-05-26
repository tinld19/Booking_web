/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserDB;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author mac
 */
public class CommonMethods {
    UserDB userDB = new UserDB();
    
    public CommonMethods() {
    }

    public User login(String phone_number, String pass_word) throws Exception {
        User user = userDB.login(phone_number, pass_word);
        if (user != null) {
            return user;
        }
        return null;
    }

    public boolean register(String fullName, String date, boolean gender, String phoneNumber, 
            String passWord, String email, String address, String role, String detail) throws Exception {
        int userId = userDB.lastIdUser();
        userId += 1;
        Date dob = Date.valueOf(date);
        User user = new User(userId, fullName, dob, gender, phoneNumber, passWord, email, address, role, detail);
        boolean result = userDB.addUser(user);
    if (result){
        return true;
    }
        return false;
    }
    
    public User viewInfo(String phoneNumber){
        User user = userDB.getInfoByPhone(phoneNumber);
        return user;
    }
    
    public boolean updateUser(User user) throws SQLException{
        boolean result = userDB.updateUser(user);
        return result;
    }
    
    public User getInfoById(int id){
        User user = userDB.getUserbyId(id);
        return user;
    }
    
    public User getInforByPhone(String phoneNumber){
        User user = userDB.getInfoByPhone(phoneNumber);
        return user;
    }
    
    public static void main(String[] args) throws Exception {
        CommonMethods cmmt = new CommonMethods();
        boolean result = cmmt.register("Le Thi Thanh Phuong", "2002-01-01", false, "1234567890", "1234567", "tin@gmail.com", "Quang  Nam", "Patient", null);
        System.out.println(result);
    }
}
