
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
           for(Products x:li)
           {
              out.println("<div>");
              out.println("<table>");
              out.println("<tr>");
              out.println("<td>");
              Double p=x.getImagePath();
              String path="images\\"+p+".jpg";
              out.println("<img src='"+path+"' alt='Product image' height=\"200\" width=\"200\">");
              out.println("</td>");
                    
                    out.println("<td>");
                    out.println("Product name:"+x.getProductName()); out.println("<br>"); 
                    
                    out.println("Product Category:"+x.getProductCategory()); out.println("<br>"); 
                   
                    out.println("Product Id:"+x.getProductId()); out.println("<br>");
                 
                    out.println("Product Price:"+x.getProductPrice());
                    out.println("</td>");
                    out.println("</tr>");  
            
               out.println("</table>");
              out.println("</div>");
           }
       %>

    </body>
</html>
