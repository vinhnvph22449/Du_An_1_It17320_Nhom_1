/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "Customers")
public class khachhang {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue
    // @Column(name="Id")
    public UUID id;

    @Column(name = "FirstName")
    public String firstname;
    
    @Column(name = "BufferName")
    public String buffername;
    
    @Column(name = "LastName")
    public String lastname;
    
    @Column(name = "Gender")
    public boolean gender;
    
    @Column(name = "Address")
    public String address;
    
    @Column(name = "Email")
    public String eamil;
    
    @Column(name = "PhoneNumber")
    public String sdt;
    
    @Column(name = "Type")
    public int type;

    public khachhang() {
    }

    public khachhang(UUID id, String firstname, String buffername, String lastname, boolean gender, String address, String eamil, String sdt, int type) {
        this.id = id;
        this.firstname = firstname;
        this.buffername = buffername;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.eamil = eamil;
        this.sdt = sdt;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public khachhang(String firstname, String buffername, String lastname, boolean gender, String address, String eamil, String sdt, int type) {
        this.firstname = firstname;
        this.buffername = buffername;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.eamil = eamil;
        this.sdt = sdt;
        this.type = type;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getBuffername() {
        return buffername;
    }

    public void setBuffername(String buffername) {
        this.buffername = buffername;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "khachhang{" + "id=" + id + ", firstname=" + firstname + ", buffername=" + buffername + ", lastname=" + lastname + ", gender=" + gender + ", address=" + address + ", eamil=" + eamil + ", sdt=" + sdt + ", type=" + type + '}';
    }

    public Object[] toaddrow() {
        return new Object[]{id, firstname + buffername + lastname, gender, address, eamil, sdt, type};
    }

}
