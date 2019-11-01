package com.ComicBookStore.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility 
{
    
    public static Connection getConnection(){
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.23.23.183:1521:xe","hr","hr");       
     
        return con;
    }    
    catch(ClassNotFoundException e)
    {
      e.printStackTrace();
      return null;
    }
    catch(SQLException e)
    {
     e.printStackTrace();
      return null;    
    }
    }
}
