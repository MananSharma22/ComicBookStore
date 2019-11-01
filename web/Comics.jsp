
<%@page import="com.ComicBookStore.dao.CategoryDaoImpl"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="com.ComicBookStore.modal.Products"%>
<%@include file="NavBar.jsp" %>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>ComicBookStore</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </head>
    <body>
  <link href="NavBar.jsp" rel="import">       
   <%
          CategoryDaoImpl cdi=new CategoryDaoImpl();
          List<Products> li=new LinkedList();
          li=cdi.showComics();
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
