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
@Table(name = "Size")
public class size {

    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue

    public UUID id;

    @Column(name = "Code")
    public String code;

    @Column(name = "Size")
    public int size;

    public size() {
    }

    public size(UUID id, String code, int size) {
        this.id = id;
        this.code = code;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "size{" + "id=" + id + ", code=" + code + ", size=" + size + '}';
    }
    
    public Object[] toaddrow() {
        return new Object[] {id,code,size};
    }

}
