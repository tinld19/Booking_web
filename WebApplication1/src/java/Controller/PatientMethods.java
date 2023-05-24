/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Appointment;
import Model.AppointmentDB;
import Model.Available;
import Model.AvailableDB;
import Model.User;
import Model.UserDB;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mac
 */
public class PatientMethods {
    AppointmentDB apDB = new AppointmentDB();
    AvailableDB aDB = new AvailableDB();
    UserDB uDB = new UserDB();
    
    public PatientMethods() {
    }
    
    public List<Appointment> listYourAppointment(User user, String status) throws SQLException{
        List<Appointment> listAppointment = apDB.listYourAppointment(user, status);
        return listAppointment;
    }
    
    public boolean booking(User user, User doctor, int slot, String date_){
        boolean result = apDB.addAppointment(user, doctor, slot, date_);
        return result;
    }
    
    public boolean deleteBooking(int patient_id, int PIC, String date, int slot){
        Appointment appointment = apDB.getInfoAppointment(patient_id, PIC,date, slot);
        boolean result = apDB.deleteAppointment(appointment);
        return result;
    }
    
    public List<User> getDoctorByDate(String date){
        List<User> listUser = uDB.listDoctorByDay(date);
        return listUser;
    }
    
    public List<Available> getAvailableOfDoctor(User doctor, String date) throws SQLException{
        List<Available> availableList = aDB.getAvailableByDate(doctor, date);
        return availableList;
    }
    
    public static void main(String[] args) {
        
    }
}
