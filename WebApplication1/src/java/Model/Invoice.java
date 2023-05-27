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
public class Invoice {
    private int idInvoice;
    private int idMedicalRecord;
    private float cost;
    private Date date_;
    private String status_ = "Chưa thu";
    
    public Invoice() {
    }
    
    public Invoice(int idInvoice, int idMedicalRecord, float cost, Date date_,String status_) {
        this.idInvoice = idInvoice;
        this.idMedicalRecord = idMedicalRecord;
        this.cost = cost;
        this.date_ = date_;
        this.status_ = status_;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Date getDate_() {
        return date_;
    }

    public void setDate_(Date date_) {
        this.date_ = date_;
    }

    public String getStatus_() {
        return status_;
    }

    public void setStatus_(String status_) {
        this.status_ = status_;
    }

    @Override
    public String toString() {
        return "Invoice{" + "idInvoice=" + idInvoice + ", idMedicalRecord=" + idMedicalRecord + ", cost=" + cost + ", date_=" + date_ + ", status_=" + status_ + '}';
    }
     
}
