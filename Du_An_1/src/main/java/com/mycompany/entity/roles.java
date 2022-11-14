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
@Table(name="Roles")
public class roles {
    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue
    
    public UUID id;
    
    @Column(name="Code")
    public String code;
     @Column(name="Name")
    public String name;

    public roles() {
    }

    public roles(UUID id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "roles{" + "id=" + id + ", code=" + code + ", name=" + name + '}';
    }
    
     public Object[] toaddrow() {
         return new Object[] {id,code,name};
     }
    
}
