<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" session="true"%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.ComicBookStore.admin.ProductServlet"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.ComicBookStore.config.ConnectionUtility"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ComicBookStore.modal.Products"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List"%>
<%@page import="com.ComicBookStore.dao.ProductDaoImpl"%>

<%@page import="java.nio.file.Paths"%>
<%@page import="java.nio.file.Path"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@include file="NavBar.jsp" %>         
<!DOCTYPE html>

<head>
  <title>ComicBookStore</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

  <style>
    body
    {
        background-color:  #1aa3ff;
;
    }
    #StyleDisplay
    {
      padding: 2px;
      color: black;
      border-collapse: separate;
      font-family: arial;
      font-size:15px;
      font-weight: bold;
    }
    
      
  </style>

</head>
<body>
<link href="NavBar.jsp" rel="import">  

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!--**********************code to display all the products**************************************************-->

<%
//    session=request.getSession(true);  
//    String n=(String)session.getAttribute("uname");  
//    out.println("Welcome: "+n);
//   
  
  ProductDaoImpl pdi=new ProductDaoImpl();
 
          List <Products> list=new LinkedList();
          list=pdi.getAllProducts();
          
          for(Products ls: list)
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


