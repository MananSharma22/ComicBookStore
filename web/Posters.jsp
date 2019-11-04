
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="com.ComicBookStore.modal.Products"%>
<%@page import="com.ComicBookStore.dao.CategoryDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="NavBar.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posters</title>
    </head>
    <body>
    <link href="NavBar.jsp" rel="import"> 
  
  
   <%
          CategoryDaoImpl cdi=new CategoryDaoImpl();
          List<Products> li=new LinkedList();
          li=cdi.showPosters();
                 for(Products ls: li)
          {
              out.println("<div>");
              out.println("<form action='Cart.jsp'>");
              out.println("<table id='StyleDisplay'>");
              
              
              out.println("<tr>");
              out.println("<td>");
              Double p=ls.getImagePath();
              String path="images\\"+p+".jpg";
              out.println("<img src='"+path+"' alt='Product image' height=\"200\" width=\"200\">");
              out.println("</td>");
           
                            
             
                    out.println("<td>");
                    out.println("Product name:"+ls.getProductName()); out.println("<br>"); 
                 
                    out.println("Product Category:"+ls.getProductCategory()); out.println("<br>"); 
                   
                    out.println("Product Id:"+ls.getProductId()); out.println("<br>");
                 
                    out.println("Product Price:"+ls.getProductPrice());
                   
                    %>
                    
                    <input type='hidden' name='ProductId' value=<%= ls.getProductId() %>  > 
                    <input type='hidden' name='ProductPrice' value=<%= ls.getProductPrice() %> >
                    <input type='hidden' name='ProductName' value=<%= ls.getProductName() %> >                   
                    <%
                    out.println("<input type='submit' value='Buy Now'>");
                    out.println("</td>");
                    out.println("</tr>");  
            
              out.println("</form>");      
              out.println("</table>");      
              out.println("</div>");
             
          }
       %>

    </body>
</html>
