/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.product;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Administrator
 */
public class productrepbon {

    public static Session sseion = HibernateUtil.getFACTORY().openSession();

    public List<product> getall() {
        Query q = sseion.createQuery("From product");
        // Tao List
        List<product> list = q.getResultList();
        return list;
    }

    public Boolean add(product pr) {
        try {
            sseion.getTransaction().begin();
            sseion.save(pr);
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean delete(UUID id) {
        try {
            sseion.getTransaction().begin();
            sseion.delete(sseion.get(product.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean update(UUID id, product pr) {
        try {
            product pro = new product();
            pro.setProductName(pr.getProductName());
            sseion.getTransaction().begin();
            sseion.save(pro);
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
