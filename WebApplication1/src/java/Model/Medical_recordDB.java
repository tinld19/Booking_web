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
public class Medical_recordDB extends DBConnect {
    InvoiceDB ivDB = new InvoiceDB();
    public Medical_recordDB() {
        super();
    }
    
    public boolean addMedicalRecord(Medical_record medicalRecord){
        String sql = "INSERT INTO [dbo].[Medical_record]\n"
                + "           ([idMedicalRecord]\n"
                + "           ,[patient_id]\n"
                + "           ,[PIC]\n"
                + "           ,[medical_infor]\n"
                + "           ,[prescription]\n"
                + "           ,[day_]\n"
                + "           ,[appointmentId]\n"
                + "           ,[idInvoice]\n"
                + "     VALUES "
                + "           (?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, medicalRecord.getIdMedicalRecord());
            st.setInt(2, medicalRecord.getPatient_id());
            st.setInt(3, medicalRecord.getPIC());
            st.setString(4, medicalRecord.getMedical_infor());
            st.setString(5, medicalRecord.getPrescription());
            st.setDate(6, medicalRecord.getDay_());
            st.setInt(7, medicalRecord.getAppointmentId());
            st.setInt(8, medicalRecord.getIdInvoice());
            st.executeUpdate();
            Invoice invoice = new Invoice(medicalRecord.getIdInvoice(), medicalRecord.getIdMedicalRecord(),(float) 200.000, medicalRecord.getDay_(), "Chưa thu"); 
            boolean result = ivDB.addInvoice(invoice);
            return result;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
}
    
    public List<Medical_record> listMedicalRecordByPatient(int patient_id){
        List<Medical_record> listMedicalRecordByPatient = new ArrayList<>();
        try{
        String sql = "SELECT * \n" 
                + "FROM [dbo].[Medical_record] WHERE patient_id = ?";
        PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, patient_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Medical_record medicalRecord = new Medical_record(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getInt(8));
                listMedicalRecordByPatient.add(medicalRecord);
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
 
        return listMedicalRecordByPatient;
    }
    
    public Medical_record getDetail(int idMedicalRecord){
        
         try{
        String sql = "SELECT * \n" 
                + "FROM [dbo].[Medical_record] WHERE idMedicalRecord = ?";
        PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, idMedicalRecord);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Medical_record medicalRecord = new Medical_record(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getInt(8));
              return medicalRecord;
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
         return null;
    }
    
    public int lastIdMedicalRecord() {
        int lastId = 0;
        try {
            String sql = "SELECT Max(idMedicalRecord)\n"
                    + "  FROM [Polyclinic].[dbo].[Medical_record]";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lastId = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return lastId;
    }
}