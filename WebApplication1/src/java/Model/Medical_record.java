/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author mac
 */
public class Medical_record {
    private int idMedicalRecord;
    private int patient_id;
    private int PIC;
    private String medical_infor;
    private String prescription;
    private Date day_;
    private int appointmentId;
    private int idInvoice;

    public Medical_record() {
    }

    public Medical_record(int idMedicalRecord, int patient_id, int PIC, String medical_infor, String prescription, Date day_, int appointmentId, int idInvoice) {
        this.idMedicalRecord = idMedicalRecord;
        this.patient_id = patient_id;
        this.PIC = PIC;
        this.medical_infor = medical_infor;
        this.prescription = prescription;
        this.day_ = day_;
        this.appointmentId = appointmentId;
        this.idInvoice = idInvoice;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getPIC() {
        return PIC;
    }

    public void setPIC(int PIC) {
        this.PIC = PIC;
    }

    public String getMedical_infor() {
        return medical_infor;
    }

    public void setMedical_infor(String medical_infor) {
        this.medical_infor = medical_infor;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Date getDay_() {
        return day_;
    }

    public void setDay_(Date day_) {
        this.day_ = day_;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    @Override
    public String toString() {
        return "Medical_record{" + "idMedicalRecord=" + idMedicalRecord + ", patient_id=" + patient_id + ", PIC=" + PIC + ", medical_infor=" + medical_infor + ", prescription=" + prescription + ", day_=" + day_ + ", appointmentId=" + appointmentId + ", idInvoice=" + idInvoice + '}';
    }
}