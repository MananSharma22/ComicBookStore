package com.ComicBookStore.CheckOut;

import com.ComicBookStore.config.ConnectionUtility;
import com.ComicBookStore.dao.CartDao;
import com.ComicBookStore.dao.CartDaoImpl;
import com.ComicBookStore.modal.Cart;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckOutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out=response.getWriter();
        
        Random random=new Random();
        int OrderId=random.nextInt(10000);
        
        String ProductName=request.getParameter("ProductName");
        int ProductPrice=Integer.parseInt(request.getParameter("ProductPrice"));
        int Quantity=Integer.parseInt(request.getParameter("Quantity"));
        
        int TotalPrice = ProductPrice*Quantity;
                
        long PhoneNumber=Long.parseLong(request.getParameter("PhoneNumber"));
        String Address=request.getParameter("Address");
       
        Cart cart=new Cart();
        cart.setOrderId(OrderId);
        cart.setProductName(ProductName);
        cart.setQuantity(Quantity);
        cart.setTotalPrice(TotalPrice);
        cart.setPhoneNumber(PhoneNumber);
        cart.setAddress(Address);
        
        
        System.out.println(OrderId);
        System.out.println(ProductName);
        
        System.out.println(PhoneNumber);
        System.out.println(Quantity);
        
        CartDao dao=new CartDaoImpl();       
        if(dao.addCart(cart))
        { 
             out.print("Order Placed Successfully");
        }
        else
        {
            out.print("Unable to place order!");
        }
        }


}
