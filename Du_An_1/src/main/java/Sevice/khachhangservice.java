/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.khachhang;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface khachhangservice {
    public List<khachhang> finall();
      khachhang getkhid(Integer id);
      boolean add(khachhang kh);
      boolean delete(Integer id);
      boolean update(khachhang kh,Integer id);
      khachhang getbyname(String name);
}
