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
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class DoctorMethods {
    AvailableDB aDB = new AvailableDB();
    AppointmentDB apDB = new AppointmentDB();
    
    public DoctorMethods() {
    }
    
    public List<Available> availableByDateOfDoctor(User user, String date) throws SQLException{
        List<Available> listAppointment = aDB.getAvailableByDate(user, date);
        return listAppointment;
    }
    
    public boolean createAvailable(User doctor, String date_, List<Integer> slots) throws ParseException{
        Date date = Date.valueOf(date_);
        List<Available> availableList = new ArrayList<>();
        for(Integer slot: slots){
            Available schedule = new Available(doctor.getUserId(), date, slot, "Đang trống");
            availableList.add(schedule);
        }
        return aDB.createYourSchedule(availableList);
    }
    
    
    public List<Appointment> viewAppointmentByDate(User doctor,String date_){
        List<Appointment> listAppointment = apDB.getAppointmentOfDoctorByDate(doctor, date_);
        return listAppointment;
    }
    
    public boolean deleteAppointment(Appointment appointment){
        boolean result = apDB.deleteAppointment(appointment);
        return result;
    }
    
    public static void main(String[] args) throws SQLException {
        DoctorMethods dtmt = new DoctorMethods();
        UserDB uDB = new UserDB();
    }
}
