
package com.ComicBookStore.dao;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CartDaoImpl implements CartDao 
{

    @Override
    public boolean addCart(Cart c) 
    {
    try
    {
       
        Connection con=ConnectionUtility.getConnection();
        PreparedStatement ps=con.prepareStatement("Insert into Cart values(?,?,?,?,?,?)");
        ps.setInt(1, c.getOrderId());
        ps.setString(2, c.getProductName());
        ps.setInt(3, c.getQuantity());
        ps.setLong(4, c.getPhoneNumber());       
        ps.setString(5, c.getAddress());
        ps.setInt(6, c.getTotalPrice());
        
        int i=ps.executeUpdate();
        if(i<=1)
        {
            return true;
        }
        else
        {
            return false;
        }
            
        
    }
    catch(SQLException ex)
    {
      ex.printStackTrace();
    }
        return false; 
    
    
    }
}
