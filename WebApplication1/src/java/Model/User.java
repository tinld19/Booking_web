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
public class User {
    private int userId;
    private String fullName;
    private Date dob;
    private boolean gender;
    private String phoneNumber;
    private String passWord;
    private String email;
    private String address_;
    private String role_;
    private String note = null;

    public User() {
    }

    public User(int userId, String fullName, Date dob, boolean gender, String phoneNumber, String passWord, String email, String address_, String role_, String note) {
        this.userId = userId;
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
        this.email = email;
        this.address_ = address_;
        this.role_ = role_;
        this.note = note;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole_() {
        return role_;
    }

    public void setRole_(String role_) {
        this.role_ = role_;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress_() {
        return address_;
    }

    public void setAddress_(String address_) {
        this.address_ = address_;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", fullName=" + fullName + ", dob=" + dob + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", passWord=" + passWord + ", email=" + email + ", address_=" + address_ + ", role_=" + role_ + ", note=" + note + '}';
    }
    
   

    /**
     *
     * @param userId
     * @param fullName
     * @param dob
     * @param gender
     * @param phoneNumber
     * @param passWord
     * @param email
     * @param address
     * @param role
     */
     
}
    