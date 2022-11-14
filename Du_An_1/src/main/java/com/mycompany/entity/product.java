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
@Table(name="Product")
public class product {
    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue
    public UUID id;
    
    @Column(name="ProductName")
    public String ProductName;

    public product() {
    }

    public product(UUID id, String ProductName) {
        this.id = id;
        this.ProductName = ProductName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", ProductName=" + ProductName + '}';
    }
    
    public Object[] toaddrow() {
        return new Object[] {id,ProductName};
    }
    
    
}
