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
    
    public List<Available> createAvailable(User doctor, String date_, List<Integer> slots, String status_) throws ParseException{
        Date date = Date.valueOf(date_);
        List<Available> availableList = new ArrayList<>();
        for(Integer slot: slots){
            if(status_ == null){
                status_ = "Đang trống";
            }else{
                status_ = "Đã đặt";
            }
            Available schedule = new Available(doctor.getUserId(), date, slot, status_);
            availableList.add(schedule);
        }
        return availableList;
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
