/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.product;
import com.mycompany.entity.roles;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface roloeservice {
    public List<roles> getall();
    
    public Boolean add(roles rl);
    
    public Boolean delete(Integer id);
    
    public Boolean update(roles rl,Integer id);
}
