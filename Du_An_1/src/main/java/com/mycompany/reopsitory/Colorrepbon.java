/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.color;
import com.mycompany.entity.khachhang;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import java.util.UUID;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Administrator
 */
public class Colorrepbon {

    public static Session session = HibernateUtil.getFACTORY().openSession();

    // getall
    public List<color> getall() {
        // cau lenh het du lieu tu sql
        Query q = session.createQuery("From color");
        // tao List
        List<color> list = q.getResultList();
        return list;

    }

    public Boolean add(color cl) {
        try {
            session.getTransaction().begin();
            session.save(cl);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean delete(UUID id) {
        try {
            session.getTransaction().begin();
            session.delete(session.get(color.class, id));
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean update(UUID id, color cl) {
        try {
        color cl1 = new color();
        cl1.setCode(cl.getCode());
        cl1.setColorName(cl.getColorName());
         session.getTransaction().begin();
         session.save(cl1);
         session.getTransaction().begin();
         session.close();
         return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
         new Colorrepbon().getall().forEach(s->System.out.println(s.toString()));
        // System.out.println(new Colorrepbon().add(new color("Code01", "Giayadidas")));
      System.out.println(new Colorrepbon().delete(UUID.fromString("7979eb49-aee1-4073-8906-66168c6e727a")));
      
    }
}
