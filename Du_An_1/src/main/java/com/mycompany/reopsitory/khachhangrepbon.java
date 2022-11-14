/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.khachhang;
import com.mycompany.utils.HibernateUtil;
//import com.mycompany.utils.SQLCommand;
import java.util.List;
import java.util.UUID;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class khachhangrepbon {

    public static Session session = HibernateUtil.getFACTORY().openSession();

    // getall
    public List<khachhang> getAll() {
        Query q = session.createQuery("From khachhang");
        List<khachhang> list = q.getResultList();
        return list;
    }

    
    public Boolean add(khachhang kh) {
        try {
            session.getTransaction().begin();
            session.save(kh);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

//        Transaction transition = null;
//        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
//            transition = (Transaction) session.beginTransaction();
//
//            session.save(kh);
//            transition.commit();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return false;
    }

    public boolean delete(UUID id) {
        try {

            session.getTransaction().begin();
            session.delete(session.get(khachhang.class, id));
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
//    @Override
//    public Boolean update(UUID id, CuaHang cv) {
//
//        try {
//            CuaHang newUpdate = new CuaHang();
//            newUpdate = session.get(CuaHang.class, id);
//            newUpdate.setMa(cv.getMa());
//            newUpdate.setTen(cv.getTen());
//            newUpdate.setDiaChi(cv.getDiaChi());
//            newUpdate.setThanhPho(cv.getThanhPho());
//            newUpdate.setQuocGia(cv.getQuocGia());
//            session. getTransaction().begin();
//            session.save(newUpdate);
//            session.getTransaction().commit();
//            session.close();
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }

    public boolean Update(UUID id, khachhang kh) {
        try {
            khachhang kh1 = new khachhang();
            kh1.setFirstname(kh.getFirstname());
            kh1.setBuffername(kh.getBuffername());
            kh1.setLastname(kh.getLastname());
            kh1.setGender(kh.gender);
            kh1.setAddress(kh.getAddress());
            kh1.setEamil(kh.getEamil());
            kh1.setSdt(kh.getSdt());
            kh1.setType(kh.getType());
            session.getTransaction().begin();
            session.save(kh1);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

//    public Boolean delete(Integer id) {
//        Transaction transion = null;
//        khachhang kh = null;
//        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
//            transion = session.beginTransaction();
//            kh = session.get(khachhang.class, id);
//            session.delete(kh);
//            transion.commit();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//        return false;
//    }
//    public Boolean update(khachhang kh) {
//        Transaction transaction = null;
//        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
//            transaction = session.beginTransaction();
//            session.saveOrUpdate(kh);
//            transaction.commit();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
    public static void main(String[] args) {
        new khachhangrepbon().getAll().forEach(s -> System.out.println(s.toString()));
//    khachhang kh =new khachhang();
//    kh.setLastname("ABC");
//        System.out.println(new khachhangrepbon().add(kh));
       //   System.out.println(new khachhangrepbon().add(new khachhang("Nguyen", "Van", "Vinh", true, "Bg", "Vinhvph22449", "03456789", 0)));
    //    System.out.println(new khachhangrepbon().delete(UUID.fromString("e07fd338-8d68-468f-b2cd-263653a7cdab")));
  ///    System.out.println(new khachhangrepbon().Update(UUID.fromString("e07fd338-8d68-468f-b2cd-263653a7cdab"),new khachhang("Nguyen", "Van", "Vinh", true, "Bg", "Vinhvph22449", "03456789", 0)));
    
    }
}
