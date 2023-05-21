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
    
    
    public boolean addAppointment(){
        return false;
    }
    
    public boolean deleteAppointment(){
        return false;
    }
    
    public boolean bookingAppointment(User user, User doctor, int slot, String date_){
        Date date = Date.valueOf(date_);
        String status_;
        Appointment appointment = new Appointment(1, user.getUserId(), doctor.getUserId(), user.getUserId(), date, slot, status_ = "đã đặt");
        return false;
    }
    
    public static void main(String[] args) {
        
    }
}
