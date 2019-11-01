
package com.ComicBookStore.register;

import com.ComicBookStore.dao.CustomerDao;
import com.ComicBookStore.dao.CustomerDaoImpl;
import com.ComicBookStore.modal.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String Fname= request.getParameter("fname");
        String Lname= request.getParameter("lname");
        String email= request.getParameter("email");
        String pass= request.getParameter("password");
        
        System.out.print(Fname);
        
        Customer customer=new Customer();
        customer.setFname(Fname);
        customer.setLname(Lname);
        customer.setEmail(email);
        customer.setPassword(pass);
        System.out.print(Fname);
        CustomerDao dao=new CustomerDaoImpl();
        if(dao.addCustomer(customer))
        {
            out.print("Registered successfully");
        } else
        {
            out.println("not registered");
        }
        
    }


}
