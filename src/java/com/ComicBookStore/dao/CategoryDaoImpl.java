
package com.ComicBookStore.dao;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Products;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.sql.Connection;

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public LinkedList<Products> showComics() {
        try{
        
    Connection con=ConnectionUtility.getConnection();
    Statement st=con.createStatement();
    ResultSet rs= st.executeQuery("Select * from Products where ProductCategory='Comics'");
    LinkedList <Products> li=new LinkedList<>();
    while(rs.next())
    {
         Products pr=new Products();
    String ProductName=rs.getString("ProductName");
    String ProductCategory=rs.getString("ProductCategory");
    String ProductPrice=rs.getString("ProductPrice");
    double ProductId=rs.getDouble("ProductId");
    double ImagePath=rs.getDouble("ImagePath");
    
    //System.out.println(ProductName+ProductPrice+ProductId);     
    pr.setProductName(ProductName);
    pr.setProductCategory(ProductCategory);
    pr.setProductPrice(ProductPrice);
    pr.setProductId(ProductId);
    pr.setImagePath(ImagePath);
    li.add(pr);
     }
    return li;
        }
        catch(SQLException e)
        {
        e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Products> showPosters() {
            try{
        
    Connection con=ConnectionUtility.getConnection();
    Statement st=con.createStatement();
    ResultSet rs= st.executeQuery("Select * from Products where ProductCategory='Posters'");
    LinkedList<Products> li=new LinkedList<>();
    while(rs.next())
    {
         Products pr=new Products();
    String ProductName=rs.getString("ProductName");
    String ProductCategory=rs.getString("ProductCategory");
    String ProductPrice=rs.getString("ProductPrice");
    double ProductId=rs.getDouble("ProductId");
    double ImagePath=rs.getDouble("ImagePath");
    
    //System.out.println(ProductName+ProductPrice+ProductId);     
    pr.setProductName(ProductName);
    pr.setProductCategory(ProductCategory);
    pr.setProductPrice(ProductPrice);
    pr.setProductId(ProductId);
    pr.setImagePath(ImagePath);
    li.add(pr);
     }
    return li;
        }
        catch(SQLException e)
        {
        e.printStackTrace();
        }
        return null;
    }
   
    

    @Override
    public List<Products> showTshirts() 
    {
                try{
        
    Connection con=ConnectionUtility.getConnection();
    Statement st=con.createStatement();
    ResultSet rs= st.executeQuery("Select * from Products where ProductCategory='T-Shirt'");
    LinkedList<Products> li=new LinkedList<>();
    while(rs.next())
    {
         Products pr=new Products();
    String ProductName=rs.getString("ProductName");
    String ProductCategory=rs.getString("ProductCategory");
    String ProductPrice=rs.getString("ProductPrice");
    double ProductId=rs.getDouble("ProductId");
    double ImagePath=rs.getDouble("ImagePath");
    
    //System.out.println(ProductName+ProductPrice+ProductId);     
    pr.setProductName(ProductName);
    pr.setProductCategory(ProductCategory);
    pr.setProductPrice(ProductPrice);
    pr.setProductId(ProductId);
    pr.setImagePath(ImagePath);
    li.add(pr);
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

    

    
   
