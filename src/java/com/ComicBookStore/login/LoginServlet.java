package com.ComicBookStore.login;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.modal.Customer;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
    RequestDispatcher rd=null;
    boolean login =false;;
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       
       String s1=request.getParameter("email");
       String s2=request.getParameter("password");
       if(s1.equals("admin@gmail.com")&& s2.equals("password@123"))
       {
           rd = request.getRequestDispatcher("Admin.jsp");
           rd.forward(request, response);
       }
     try{
       Connection con=ConnectionUtility.getConnection();
       PreparedStatement ps =con.prepareStatement("Select * from ComicBookStore Where email=? and pass=?");
       ps.setString(1, s1);
       ps.setString(2, s2);
       ResultSet rs=ps.executeQuery();
   
       if(rs.next())
       {
         out.println("successful login");
         HttpSession session=request.getSession();  
          session.setAttribute("uname", s1);
          rd=request.getRequestDispatcher("ShoppingPage.jsp");
          rd.forward(request,response);
                     
       }else
       {
         RequestDispatcher rd=request.getRequestDispatcher("SignIn.jsp");
         rd.include(request,response);
         out.println("<div style='color:red' align='center'>Email or Password is incorrect</div>");
       }
      
     }catch(SQLException e)
     {
         out.println("login failed,"+e);
     }     
    }
}