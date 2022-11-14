/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.size;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Administrator
 */
public class sizerepbon {

    public static Session sseion = HibernateUtil.getFACTORY().openSession();

    public List<size> getall() {
        Query q = sseion.createQuery("From Size");
        List<size> list = q.getResultList();
        return list;
    }

    public Boolean add(size sz) {
        try {
            sseion.getTransaction().begin();
            sseion.save(sz);
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
            sseion.delete(sseion.get(size.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean update(UUID id, size sr) {
        try {
            size sr1 = new size();
            sr1.setCode(sr.getCode());
            sr1.setSize(sr.getSize());
            sseion.getTransaction().begin();
            sseion.delete(sseion.get(size.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
