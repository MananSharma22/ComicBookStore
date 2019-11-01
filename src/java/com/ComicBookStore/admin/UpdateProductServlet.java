
package com.ComicBookStore.admin;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Products;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        
        String ProductName=request.getParameter("ProductName");
        String ProductCategory=request.getParameter("ProductCategory");
        String ProductPrice=request.getParameter("ProductPrice");
        
        Products pr=new Products();
        pr.setProductName(ProductName);
        pr.setProductCategory(ProductCategory);
        pr.setProductPrice(ProductPrice);
        try{
        Connection con=ConnectionUtility.getConnection();
        PreparedStatement ps=con.prepareStatement("Update Products Set ProductName=? , ProductPrice=? Where ProductCategory=? ");
        ps.setString(1,pr.getProductName());
        ps.setString(2, pr.getProductPrice());
        ps.setString(3, pr.getProductCategory());
       
        int i=ps.executeUpdate();
        if(i>=1)
        {
          out.println("<div align='center' style=color:'green'>Product Updated</div>");
         RequestDispatcher rd=request.getRequestDispatcher("UpdateProducts.jsp");
         rd.include(request, response);

        }
        else
        {
            out.println("<div align='center' style=color:'green'>Unable to Update Product!</div>");
         RequestDispatcher rd=request.getRequestDispatcher("UpdateProducts.jsp");
         rd.include(request, response);

        }
        }
        catch(SQLException  e)
        {
            out.print("Exception"+e);
        }
    }

}
