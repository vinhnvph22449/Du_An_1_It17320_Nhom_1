/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.product;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface productservice {
    
    public List<product> getall();
    
    public Boolean add(product pro);
    
    public Boolean delete(Integer id);
    
    public Boolean update(product pro,Integer id);
    
    
}
