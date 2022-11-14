/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.size;
import com.mycompany.entity.soles;
import com.mycompany.entity.trademark;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Administrator
 */
public class trademarkservice {

    public static Session sseion = HibernateUtil.getFACTORY().openSession();

    public List<trademark> getall() {
        Query q = sseion.createQuery("From trademark");
        List<trademark> list = q.getResultList();
        return list;
    }

    public Boolean add(trademark tm) {
        try {
            sseion.getTransaction().begin();
            sseion.save(tm);
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean add(UUID id) {
        try {
            sseion.getTransaction().begin();
            sseion.delete(sseion.get(trademark.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean update(UUID id, trademark tm) {
        try {
            trademark tm1 = new trademark();
            tm1.setCode(tm.getCode());
            tm1.setName(tm.getName());
            sseion.getTransaction().begin();
            sseion.delete(sseion.get(trademark.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public static void main(String[] args) {
        
    }

}
