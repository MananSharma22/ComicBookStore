
package com.ComicBookStore.admin;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Products;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;
import javax.servlet.annotation.MultipartConfig;
import java.io.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

@MultipartConfig (fileSizeThreshold=1024, maxFileSize=1024*1024*10,  maxRequestSize=1024*1024*50)
public class ProductServlet extends HttpServlet 
{
    String p="C:\\Users\\s020012001\\Documents\\NetBeansProjects\\ComicBookStore\\web\\images";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");

      try
         {
        Double ProductId=Math.random();
        Double ImagePath=ProductId;
        String ProductName= request.getParameter("ProductName");
        String ProductCategory=request.getParameter("ProductCategory");
        String ProductPrice= request.getParameter("ProductPrice");
        
             Part part=request.getPart("myfile");
                       
			InputStream fis=part.getInputStream();
			byte[] bytes= IOUtils.toByteArray(fis);
			String path="C:\\Users\\s020012001\\Documents\\NetBeansProjects\\ComicBookStore\\web\\images\\";
			String fileName=path+File.separator+ProductId+ ".jpg";
                        System.out.println(fileName);
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                fos.write(bytes);
            }
                    
            Products pr=new Products();
            pr.setProductName(ProductName);
            pr.setProductCategory(ProductCategory);
            pr.setProductPrice(ProductPrice);
            pr.setProductId(ProductId);
            pr.setImagePath(ImagePath);
            
         
        Connection con=ConnectionUtility.getConnection();
        PreparedStatement ps=con.prepareStatement("Insert into Products values(?,?,?,?,?)"); 
             
        ps.setString(1, pr.getProductName());
        ps.setString(2, pr.getProductCategory());
        ps.setDouble(3,pr.getProductId());
        ps.setDouble(4,pr.getImagePath());
        ps.setString(5, pr.getProductPrice());
        
            int i=ps.executeUpdate();
                            if(i>=1)
                            {
                                out.println("<div style='color:green' align='center'> Products added successfully </div>");
                                RequestDispatcher rd= request.getRequestDispatcher("Admin.jsp");
                                rd.include(request,response);   
                            }
                            else
                            {
                                out.println("<div style='color:red' align='center'> Unable to Update data! </div> ");
                                RequestDispatcher rd= request.getRequestDispatcher("Admin.jsp");
                                rd.include(request,response);  
                            }
                        }
        catch(SQLException ex)
                {
                   out.print(ex);
                }
    }
}