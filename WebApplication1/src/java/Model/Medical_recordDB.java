/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.DBConnect;
import static DAO.DBConnect.connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mac
 */
public class Medical_recordDB extends DBConnect {
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
            st.setInt(0, medicalRecord.getIdMedicalRecord());
            st.setInt(1, medicalRecord.getPatient_id());
            st.setInt(2, medicalRecord.getPIC());
            st.setString(3, medicalRecord.getMedical_infor());
            st.setString(4, medicalRecord.getPrescription());
            st.setDate(5, medicalRecord.getDay_());
            st.setInt(6, medicalRecord.getAppointmentId());
            st.setInt(7, medicalRecord.getIdInvoice());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
}
    
    
    
}