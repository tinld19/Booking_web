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
public class UserDB extends DBConnect {

    public UserDB() {
        super();
    }

    public User login(String phone_number, String pass_word) throws Exception {
        User user = null;
        try {
            String sql = "SELECT *"
                    + "  FROM [dbo].[User_]\n"
                    + "WHERE phonenumber=? and password_=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, phone_number);
            st.setString(2, pass_word);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return user;
    }
    
    public List<User> getAll() throws SQLException {
        List<User> list = new ArrayList<>();
        String sql = "SELECT [userId]\n"
                + "      ,[full_name]\n"
                + "      ,[dob]\n"
                + "      ,[gender]\n"
                + "      ,[phonenumber]\n"
                + "      ,[password_]\n"
                + "      ,[email]\n"
                + "      ,[address_]\n"
                + "      ,[role_]\n"
                + "      ,[note]\n"
                + "  FROM [Polyclinic].[dbo].[User_]";
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            User c = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            list.add(c);
        }
        return list;
    }

    public boolean addUser(User user) throws Exception {
        String sql = "INSERT INTO [dbo].[User_]\n"
                + "           ([userId]\n"
                + "           ,[full_name]\n"
                + "           ,[dob]\n"
                + "           ,[gender]\n"
                + "           ,[phonenumber]\n"
                + "           ,[password_]\n"
                + "           ,[email]\n"
                + "           ,[address_]\n"
                + "           ,[role_]\n"
                + "           ,[note])\n"
                + "     VALUES "
                + "           (?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(0, user.getUserId());
            st.setString(1, user.getFullName());
            st.setDate(2, (java.sql.Date) user.getDob());
            st.setString(3, user.getEmail());
            st.setBoolean(4, user.isGender());
            st.setString(5, user.getPhoneNumber());
            st.setString(6, user.getEmail());
            st.setString(7, user.getAddress_());
            st.setString(8, user.getRole_());
            st.setString(9, user.getNote());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateUser(User user) throws SQLException {
        String sql = "UPDATE [dbo].[User_]\n"
                + "   SET  [userId] = ?\n"
                + "      ,[full_name] = ?\n"
                + "      ,[dob] = ?\n"
                + "      ,[gender] = ?\n"
                + "      ,[phonenumber] = ?\n"
                + "      ,[password_] = ?\n"
                + "      ,[email] = ?\n"
                + "     ,[address_] = ?\n"
                + "     ,[role_] = ?\n"
                + "     ,[note] = ?\n"
                + " WHERE phonenumber=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(0, user.getUserId());
            st.setString(1, user.getFullName());
            st.setDate(2, (java.sql.Date) user.getDob());
            st.setString(3, user.getEmail());
            st.setBoolean(4, user.isGender());
            st.setString(5, user.getPhoneNumber());
            st.setString(6, user.getEmail());
            st.setString(7, user.getAddress_());
            st.setString(8, user.getRole_());
            st.setString(9, user.getNote());
            st.setString(10, user.getPhoneNumber());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public User getInfoByPhone(String phone_number){
        User user = null;
        try {
            String sql = "SELECT *"
                    + "  FROM [dbo].[User_]\n"
                    + "WHERE phonenumber=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, phone_number);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return user;
    }
    
    public User getUserbyId(int userId){
        User user = null;
        try {
            String sql = "SELECT *"
                    + "  FROM [dbo].[User_]\n"
                    + "WHERE userId=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return user;
    }
    
    public List<User> listDoctorByDay(String date_){
        Date date = Date.valueOf(date_);
        List<User> listDoctor = new ArrayList<>();
        User user = null;
        try {
            String sql = "SELECT DISTINCT * \n" +
                    "FROM User_ INNER JOIN Available ON \n" + 
                    "date_ = ? AND role_ = 'Doctor';";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setDate(1, date);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                listDoctor.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listDoctor;
    }

    public static void main(String[] args) throws SQLException, Exception {
        UserDB dt = new UserDB();
        List<User> test = dt.listDoctorByDay("2023-05-20");
        System.out.println(test.get(0).getFullName());
    }
}
