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
import java.util.List;

/**
 *
 * @author mac
 */
public class InvoiceDB extends DBConnect{
    public InvoiceDB() {
        super();
    }
    
    public boolean addInvoice(Invoice invoice){
        String sql = "INSERT INTO [dbo].[Invoice]\n"
                + "           ([idInvoice]\n"
                + "           ,[idMedicalRecord]\n"
                + "           ,[cost]\n"
                + "           ,[day_]\n"
                 + "          ,[status_]\n"
                + "     VALUES "
                + "           (?,?,?,?,?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, invoice.getIdInvoice());
            st.setInt(2, invoice.getIdMedicalRecord());
            st.setFloat(3, invoice.getCost());
            st.setDate(4, invoice.getDate_());
            st.setString(5, invoice.getStatus_());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
//    public List<Invoice> listInvoiceById(Medical_record medical_record){
//        List<Invoice> listInvoice = new ArrayList<>();
//        try{
//        String sql = "SELECT * \n" 
//                + "FROM [dbo].[Invoice] WHERE idMedicalRecord = ?";
//        PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, medical_record.getIdMedicalRecord());
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Invoice invoice = new Medical_record(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
//                        rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getInt(8));
//                listInvoice.add(invoice);
//            }
//        }catch (SQLException e) {
//            System.out.println(e);
//        }
//        return listInvoice;
//    }
}
