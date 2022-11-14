/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import com.mycompany.entity.categories;
import com.mycompany.entity.product;
import com.mycompany.entity.roles;
import com.mycompany.entity.size;
import com.mycompany.entity.trademark;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface trademarkservice {
    public List<trademark> getall();
    
    public Boolean add(trademark rl);
    
    public Boolean delete(Integer id);
    
    public Boolean update(trademark rl,Integer id);
}
