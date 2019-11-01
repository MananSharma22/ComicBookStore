
package com.ComicBookStore.dao;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Products;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;



public class ProductDaoImpl implements ProductDao 
{ 
    Connection con=null;

     @Override
     public LinkedList<Products> getAllProducts() 
    {
       
        try
        {
   con=ConnectionUtility.getConnection();
  Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("Select * from Products");
  LinkedList <Products> li=new LinkedList<>();
  while(rs.next())
  {
  Products products=new Products();
  
  String ProductName=rs.getString("ProductName");
  String ProductCategory=rs.getString("ProductCategory");
  String ProductPrice=rs.getString("ProductPrice");
  double ProductId=rs.getDouble("ProductId");
  double ImagePath=rs.getDouble("ImagePath");
  
  products.setProductName(ProductName);
  products.setProductId(ProductId);
  products.setProductCategory(ProductCategory);
  products.setProductPrice(ProductPrice);
  products.setImagePath(ImagePath);
  li.add(products);
   }
  return li;
        }
 
        catch(SQLException e)
        {
            e.printStackTrace();
        }
         return null;
        
        
    }

}