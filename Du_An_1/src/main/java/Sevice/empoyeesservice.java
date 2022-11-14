/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.employees;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface empoyeesservice {
    public List<employees> getall();
    
   public Boolean add(employees ess);
   
   public Boolean delete(Integer id);
   
   public Boolean update(employees ess,Integer id);
   
}
