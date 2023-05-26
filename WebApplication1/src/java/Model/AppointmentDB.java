/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.DBConnect;
import static DAO.DBConnect.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author mac
 */
public class AppointmentDB extends DBConnect{
    public AppointmentDB() {
        super();
    }
    
    public List<Appointment> listYourAppointment(User user, String status_) throws SQLException{
        List<Appointment> list = new ArrayList<>();
        String sql = "SELECT * \n" + 
                "FROM [dbo].[Appointment]\n" + 
                "WHERE patient_id = ? AND [status_] = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, user.getUserId());
        st.setString(2, status_);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Appointment s = new Appointment(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getString(7));
            list.add(s);
        }
        return list;
    }
    
    
    public boolean addAppointment(int create_by, User user, User doctor, int slot, String date_){
        Date date = Date.valueOf(date_);
        String status_;
        Appointment appointment = new Appointment(9, create_by, doctor.getUserId(), user.getUserId(), date, slot, status_ = "Đã đặt");
        String sql = "INSERT INTO [dbo].[Appointment]\n"
                + "           ([appointmentId]\n"
                + "           ,[create_by]\n"
                + "           ,[PIC]\n"
                + "           ,[patient_id]\n"
                + "           ,[date_]\n"
                + "           ,[slot]\n"
                + "           ,[status_])\n"
                + "     VALUES "
                + "           (?,?,?,?,?,?,?);";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, appointment.getAppointmentId());
            st.setInt(2, appointment.getCreate_by());
            st.setInt(3, appointment.getPIC());
            st.setInt(4, appointment.getPatient_id());
            st.setDate(5, appointment.getDate_());
            st.setInt(6, appointment.getSlot());
            st.setString(7, appointment.getStatus_());
            st.executeUpdate();
            
            if(create_by == doctor.getUserId()){
                 if(!addAvailableOfDoctor(doctor, date_, slot)){
                     boolean booking = bookingAppointment(appointment.getStatus_(), appointment);
                     return booking;
                 }
            }else{
                boolean booking = bookingAppointment(appointment.getStatus_(), appointment);
                return booking;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public static boolean addAvailableOfDoctor(User doctor, String date_, int slot) throws SQLException{
        AvailableDB aDB = new AvailableDB();
        List<Available> listWork = aDB.getAvailableByDate(doctor, date_);
        for (Available slot_: listWork){
            if(slot_.getSlot() == slot && slot_.getStatus_().equalsIgnoreCase("Đang trống")){
                return false;
            }
        }
        listWork.clear();
        listWork.add(new Available(doctor.getUserId(), Date.valueOf(date_), slot, "đã đặt"));
        boolean update = aDB.createYourSchedule(listWork);
        return update;
    }
    
    public boolean deleteAppointment(Appointment appointment){      
        String sql = "DELETE FROM [dbo].[Appointment]\n" + 
                "WHERE PIC = ? AND date_ = ? AND slot = ?";
        boolean booking = bookingAppointment("Đang trống", appointment);
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, appointment.getPIC());
            st.setDate(2, appointment.getDate_());
            st.setInt(3, appointment.getSlot());
            st.executeUpdate();
            return booking;
        }catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public static boolean bookingAppointment(String status, Appointment appointment){
         String sql = "UPDATE [dbo].[Available]\n"
                + "   SET  [status_] = ?\n"   
                + " WHERE doctor_id = ? AND date_ = ? AND slot = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, status);
            st.setInt(2, appointment.getPIC());
            st.setDate(3, appointment.getDate_());
            st.setInt(4, appointment.getSlot());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public Appointment getInfoAppointment(int patient_id, int PIC, String date_, int slot){
        Appointment appointment = null;
        Date date = Date.valueOf(date_);
        try {
            String sql = "SELECT *"
                    + "  FROM [dbo].[Appointment]\n"
                    + "WHERE patient_id = ? AND date_ = ? AND slot = ? AND PIC = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, patient_id);
            st.setDate(2, date);
            st.setInt(3, slot);
            st.setInt(4, PIC);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                appointment = new Appointment(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
                    rs.getDate(5), rs.getInt(6), rs.getString(7));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return appointment;
    }
    
    public List<Appointment> getAppointmentOfDoctorByDate(User doctor, String date_){
        Date date = Date.valueOf(date_);
        List<Appointment> list = new ArrayList<>();
        String sql = "SELECT * \n" + 
                "FROM [dbo].[Appointment]\n" + 
                "WHERE PIC = ? AND [date_] = ?";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, doctor.getUserId());
        st.setDate(2, date);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Appointment s = new Appointment(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getString(7));
            list.add(s);
        }
        }catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static void main(String[] args) throws Exception {
        AppointmentDB apDB = new AppointmentDB();
        UserDB uDB = new UserDB();
        User user = uDB.login("123456789", "123456");
        User doctor = uDB.login("0328860488", "lyminhchau");
        boolean result = apDB.addAppointment(1, user, doctor, 1, "2023-05-22");
//        List<Appointment> list = apDB.getAppointmentOfDoctorByDate(doctor, "2023-05-20");
//        for(Appointment appointment: list){
//            System.out.println(appointment.toString());
//        }
//        Appointment appointment = apDB.getInfoAppointment(3, 1, "2023-05-20", 1);
//        boolean result1 = apDB.deleteAppointment(appointment);
        System.out.println(result);
    }
}
