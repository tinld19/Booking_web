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
public class Available {
    private int doctor_id;
    private Date date_;
    private int slot;
    private String status_ = null;

    public Available() {
    }

    public Available(int doctor_id, Date date_, int slot, String status_) {
        this.doctor_id = doctor_id;
        this.date_ = date_;
        this.slot = slot;
        this.status_ = status_;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
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
        return "Available{" + "doctor_id=" + doctor_id + ", date_=" + date_ + ", slot=" + slot + ", status_=" + status_ + '}';
    }
    
}
