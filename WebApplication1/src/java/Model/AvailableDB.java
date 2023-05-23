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
import java.text.ParseException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author mac
 */
public class AvailableDB extends DBConnect {
    public AvailableDB() {
        super();
    }
    
    public List<Available> getAvailableByDate(User user, Date date) throws SQLException{
        List<Available> list = new ArrayList<>();
        String sql = "SELECT Available.* \n" + 
                "FROM [dbo].[Available], [dbo].[User_] \n" + 
                "WHERE [doctor_id] = ? AND [date_] = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, user.getUserId());
        st.setDate(2, (java.sql.Date) date);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Available s = new Available(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getString(4));
            list.add(s);
        }
        return list;
    }
    
    public boolean createYourSchedule(List<Available> slotInDay){
        String sql = "INSERT INTO [dbo].[Available]\n"
                + "           ([doctor_id]\n"
                + "           ,[date_]\n"
                + "           ,[slot]\n"
                + "           ,[status_])\n"
                + "     VALUES "
                + "           (?,?,?,?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            for (Available slot: slotInDay){
            st.setInt(1, slot.getDoctor_id());
            st.setDate(2,slot.getDate_());
            st.setInt(3, slot.getSlot());
            st.setString(4, slot.getStatus_());
            st.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean re_examination_schedule(){
        return false;
    }
    
    public static void main(String[] args) throws SQLException, ParseException {
        AvailableDB avDB = new AvailableDB();
//        boolean result = avDB.createYourSchedule(test);
//        System.out.println(result);

    }
    
    public List<Available> createAvailable() throws ParseException{
        String dateString = "2023-05-20";
        Date date = Date.valueOf(dateString);
        int userId = 1;
        List<Integer> slots = new ArrayList<>();
        List<Available> availableList = new ArrayList<>();
        slots.add(2);
        slots.add(4);
        slots.add(5);
        for(Integer slot: slots){
            Available schedule = new Available(userId, date, slot, "Đang trống");
            availableList.add(schedule);
        }
        return availableList;
    }
}
