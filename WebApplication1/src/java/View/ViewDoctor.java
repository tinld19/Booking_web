/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CommonMethods;
import Controller.DoctorMethods;
import Controller.PatientMethods;
import Model.Appointment;
import Model.Available;
import Model.User;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class ViewDoctor {

    public ViewDoctor() {
    }
    
    public static void menuOfDoctor(User user) throws SQLException{
        System.out.println("1. View Information");
        System.out.println("2. Create a work schedule");
        System.out.println("3. Your appointment");
        System.out.println("4. Make a follow-up appointment");
        System.out.println("5.Create a disease record");
        System.out.println("6.List appointment by date");
        Scanner input = new Scanner (System.in);
        String choice = input.nextLine();
        CommonMethods cmmt = new CommonMethods();
        DoctorMethods dtmt = new DoctorMethods();
        PatientMethods ptmt = new PatientMethods();
        switch(choice){
            case "1":
                User doctorInfor = cmmt.viewInfo(user.getPhoneNumber());
                System.out.println(doctorInfor.toString());
                break;
            case "2":
                System.out.println("Choice date");
                String date = input.nextLine();
                break;
            case "3":
                System.out.println("Choice date");
                String date_ = input.nextLine();
                List<Available> listAvailable = dtmt.availableByDateOfDoctor(user, date_);
                if(!listAvailable.isEmpty()){
                    for (Available schedule: listAvailable){
                        System.out.println(user.getFullName() + " " + schedule.getSlot() + " " + schedule.getDate_() + " " + schedule.getStatus_());
                    }
                }else{
                    System.out.println("Trống lịch");
                }
                break;
            case "4":
                System.out.println("Choice date");
                String date_1 = input.nextLine();
                System.out.println("Enter slot");
                int slot = input.nextInt();
                User patient = cmmt.getInfoById(3);
                boolean result = ptmt.booking(user.getUserId(), patient, user, slot, date_1);
                System.out.println(result);
                break;
            case "5":
                break;
            case "6":
                System.out.println("Choice date");
                String date_2 = input.nextLine();
                List<Appointment> listAppointment = dtmt.viewAppointmentByDate(user, date_2);
                System.out.println(listAppointment);
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
                break;
            case "2":
           
                break;
 
        }
    }
}