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
@Table(name="Colors")
public class color {
    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue
    public UUID id;
    
    @Column(name="code")
    public String code;
    @Column(name="ColorName")
    public String ColorName;

    public color() {
    }

    public color(String code, String ColorName) {
        this.code = code;
        this.ColorName = ColorName;
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

    public String getColorName() {
        return ColorName;
    }

    public void setColorName(String ColorName) {
        this.ColorName = ColorName;
    }

    @Override
    public String toString() {
        return "color{" + "id=" + id + ", code=" + code + ", ColorName=" + ColorName + '}';
    }
    
    public Object[] toaddrow() {
      return new Object[] {id,code,ColorName};
    }
    
  
    
}
