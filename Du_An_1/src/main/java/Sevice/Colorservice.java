/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.color;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface Colorservice {
    public List<color> getall();
    public boolean add(color cl);
    public boolean delete(Integer id);
    public boolean update(color cl,Integer id);
}
