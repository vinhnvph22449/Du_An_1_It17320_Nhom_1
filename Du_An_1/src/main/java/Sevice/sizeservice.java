/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.product;
import com.mycompany.entity.roles;
import com.mycompany.entity.size;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface sizeservice {
    public List<size> getall();
    
    public Boolean add(size rl);
    
    public Boolean delete(Integer id);
    
    public Boolean update(size rl,Integer id);
}
