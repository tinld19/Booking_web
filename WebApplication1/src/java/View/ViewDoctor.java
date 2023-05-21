/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CommonMethods;
import Model.User;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class ViewDoctor {

    public ViewDoctor() {
    }
    
    public static void menuOfDoctor(User user){
        System.out.println("1. View Information");
        System.out.println("2. Create a work schedule");
        System.out.println("3. Your appointment");
        System.out.println("4. Make a follow-up appointment");
        System.out.println("5.Create a disease record");
        Scanner input = new Scanner (System.in);
        String choice = input.nextLine();
        CommonMethods cmmt = new CommonMethods();
        switch(choice){
            case "1":
                User doctorInfor = cmmt.viewInfo(user.getPhoneNumber());
                System.out.println(doctorInfor.toString());
            case "2":
                System.out.println("Choice date");
                String date = input.nextLine();
                
            case "3":
                
            case "4":
                
            case "5":
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CommonMethods cmmt = new CommonMethods();
        System.out.println("Main");
        System.out.println("1. Login");
        System.out.println("2. Register");
        String choice = input.nextLine();
        switch(choice){
            case "1":
                System.out.println("Enter phone number");
                String phone_number = input.nextLine();
                System.out.println("Enter pass word");
                String pass_word = input.nextLine();
                User user = cmmt.login(phone_number, pass_word);
                if(user != null){
                    System.out.println("Login success!");
                    menuOfDoctor(user);
                }else{
                    System.out.println("Login fail!");
                }
            case "2":
                
        }
    }
}
