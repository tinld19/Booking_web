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
public class Appointment {
    private int appointmentId;
    private int create_by;
    private int PIC;
    private int patient_id;
    private Date date_;
    private int slot;
    private String status_ = null;

    public Appointment() {
    }

    public Appointment(int appointmentId, int create_by, int PIC, int patient_id, Date date_, int slot, String status_) {
        this.appointmentId = appointmentId;
        this.create_by = create_by;
        this.PIC = PIC;
        this.patient_id = patient_id;
        this.date_ = date_;
        this.slot = slot;
        this.status_ = status_;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getCreate_by() {
        return create_by;
    }

    public void setCreate_by(int create_by) {
        this.create_by = create_by;
    }

    public int getPIC() {
        return PIC;
    }

    public void setPIC(int PIC) {
        this.PIC = PIC;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public Date getDate_() {
        return date_;
    }

    public void setDate_(Date date_) {
        this.date_ = date_;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getStatus_() {
        return status_;
    }

    public void setStatus_(String status_) {
        this.status_ = status_;
    }

    @Override
    public String toString() {
        return "Appointment{" + "appointmentId=" + appointmentId + ", create_by=" + create_by + ", PIC=" + PIC + ", patient_id=" + patient_id + ", date_=" + date_ + ", slot=" + slot + ", status_=" + status_ + '}';
    }
}
