/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanhpl.dtos;

import java.util.Date;

/**
 *
 * @author jayph
 */
public class ReaderDTO {
    private String readerID, readerName;
    private boolean gender;
    private Date birthday;
    private int address;
    private String email, phone;

    public ReaderDTO(String readerID, String readerName, boolean gender, Date birthday, int address, String email, String phone) {
        this.readerID = readerID;
        this.readerName = readerName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
