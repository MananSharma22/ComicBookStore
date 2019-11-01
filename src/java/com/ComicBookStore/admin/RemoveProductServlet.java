
package com.ComicBookStore.admin;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.dao.ProductDaoImpl;
import com.ComicBookStore.modal.Products;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        
        Products pr=new Products();
       
        String ProductName=request.getParameter("ProductName");  
        pr.setProductName(ProductName);
        try
        {
        Connection con=ConnectionUtility.getConnection();
        PreparedStatement ps=con.prepareStatement("Delete from Products where ProductName=? ");
        ps.setString(1,pr.getProductName());
        
        int i=ps.executeUpdate();
        if(i>=1)
        {
            out.println("<div align='center' style=color:'green'>Product Deleted</div>");
         RequestDispatcher rd=request.getRequestDispatcher("RemoveProduct.jsp");
         rd.include(request, response);
        }
        else
        {
        out.println("<p style=color:'red'>Unable to Delete Product! </p>");
         RequestDispatcher rd=request.getRequestDispatcher("RemoveProduct.jsp");
         rd.include(request, response);
        }
        }
        catch(SQLException ex)
                {
                    out.print(ex);
                }
    }
}
