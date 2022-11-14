/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "Sole")
public class soles {

    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue
    public UUID id;

    @Column(name = "Code")
    public String code;
    @Column(name = "Name")
    public String Name;

    public soles() {
    }

    public soles(UUID id, String code, String Name) {
        this.id = id;
        this.code = code;
        this.Name = Name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

 

   

    @Override
    public String toString() {
        return "color{" + "id=" + id + ", code=" + code + ", Name=" + Name + '}';
    }

    public Object[] toaddrow() {
        return new Object[]{id, code, Name};
    }

}
