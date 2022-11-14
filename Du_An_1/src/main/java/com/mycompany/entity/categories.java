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
@Table(name = "Categories")
public class categories {

    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @GeneratedValue
    public UUID id;

    @Column(name = "Code")
    public String code;
    @Column(name = "CategoryName")
    public String CategoryName;

    public categories() {
    }

    public categories(UUID id, String code, String CategoryName) {
        this.id = id;
        this.code = code;
        this.CategoryName = CategoryName;
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

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public String toString() {
        return "categories{" + "id=" + id + ", code=" + code + ", CategoryName=" + CategoryName + '}';
    }

    public Object[] toaddrow() {
        return new Object[]{id, code, CategoryName};
    }

}
