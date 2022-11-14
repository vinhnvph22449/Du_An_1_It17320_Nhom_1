/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.roles;
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
public class rolerepbon {

    public static Session sseion = HibernateUtil.getFACTORY().openSession();

    public List<roles> getall() {
        Query q = sseion.createQuery("From roles");
        List<roles> list = q.getResultList();
        return list;
    }

    public Boolean add(roles rl) {
        try {
            sseion.getTransaction().begin();
            sseion.save(rl);
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
            sseion.delete(sseion.get(roles.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean update(UUID id, roles rl) {
        try {
           roles rl1 = new roles();
            rl1.setCode(rl.getCode());
            rl1.setName(rl.getName());
            sseion.getTransaction().begin();
            sseion.delete(sseion.get(roles.class, id));
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
