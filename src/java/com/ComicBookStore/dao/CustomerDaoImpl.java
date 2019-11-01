package com.ComicBookStore.dao;
import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Customer;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class CustomerDaoImpl implements CustomerDao 
{
      PrintWriter out=null;
      Connection con=null;
  @Override
  public boolean addCustomer(Customer customer)
  {
    // System.out.println(customer.getFname());
     try
     {
      con=ConnectionUtility.getConnection();
      PreparedStatement ps=con.prepareStatement("Insert into ComicBookStore values(?,?,?,?)");
      ps.setString(1,customer.getFname());
      
    // System.out.println(customer.getFname());
     
      ps.setString(2,customer.getLname());
      ps.setString(3,customer.getEmail());
      ps.setString(4,customer.getPass());
      int i =ps.executeUpdate();
      if(i<=1)
      {
          return true;
      }
      else
      {
      return false;
      }
      
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
      return false;
  }

    @Override
    public boolean removeCustomer(Customer customer) {
        try{
      Connection con=ConnectionUtility.getConnection();
      PreparedStatement ps=con.prepareStatement("Delete from ComicBookStore where values(?,?,?,?)");
       ps.setString(1,customer.getFname() );
       ps.setString(2, customer.getLname());
       ps.setString(3, customer.getEmail());
       ps.setString(4, customer.toString());
        
        int i=ps.executeUpdate();
      if(i==0)
      {
          System.out.println("Rows deleted successfully"+i);
      }
      else
      {
          System.out.println("unable to delete ");
      }
        
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
      return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAllCustomers()
    {
        try
        {
     Connection con=ConnectionUtility.getConnection();
     PreparedStatement ps=con.prepareStatement("Select *from ComicBookStore");
     ResultSet rs=ps.executeQuery();
     while(rs.next())
        {
            Customer cus=new Customer();
            
        }
     
        }
        catch(SQLException e)
        {
            out.println("Unable to fetch products"+e);
        }
          return null;
    }
}
