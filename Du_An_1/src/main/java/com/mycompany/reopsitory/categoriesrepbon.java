/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.categories;
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
public class categoriesrepbon {

    public static Session sseion = HibernateUtil.getFACTORY().openSession();

    public List<categoriesrepbon> getall() {
        Query q = sseion.createQuery("From categories");
        List<categoriesrepbon> list = q.getResultList();
        return list;
    }

    
    
    
    public Boolean add(categoriesrepbon cate) {
        try {
            sseion.getTransaction().begin();
            sseion.save(cate);
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
            sseion.delete(sseion.get(categoriesrepbon.class, id));
            sseion.getTransaction().commit();
            sseion.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean update(UUID id, categories cate) {
        try {
            categories cate1 = new categories();
            cate1.setCode(cate.getCode());
            cate1.setCategoryName(cate.getCategoryName());
            sseion.getTransaction().begin();
            sseion.save(cate1);
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
