
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ComicBookStore</title>
    </head>
        <body>
            <div>
            <h1> Cart </h1>
            </div>
            
     <%
       
         String ProductName=request.getParameter("ProductName");
         String ProductId=request.getParameter("ProductId");
         String ProductPrice=request.getParameter("ProductPrice"); 
         
         out.println("Product Name"+ProductName);
         out.println("<br>");
         out.println("Product Price"+ProductPrice);         
     %>
         
     <div>
           <form action="CheckOutServlet" method="post">
               
     <input type="hidden" value=<%=ProductName%> name="ProductName">
     <input type="hidden" value=<%=ProductPrice%> name="ProductPrice">
      
         <table>
         <tr>
                <td> Select Quantity:</td>
                <td>
                    <select name="Quantity" id="Quantity" > 
                    <option value="1">1</option>
                    <option value="2">2 </option>
                    <option value="3">3</option>
                    <option value="4">4</option>    
                    </select>
                </td>
         </tr>                   
               <tr>
                    <td>
                     Phone Number: <input type="number" name="PhoneNumber">
                    </td>
               </tr>                        
                        
                <tr>
                    <td>
                       Delivery Address: <textarea rows="5" cols="30" id="textarea" name="Address"></textarea>
                    </td>
                </tr>
                
                    <tr>
                        <td>
                         <input type="submit" value="CheckOut">   
                        </td>
                    </tr> 
                    </table>
                     </form>   
                </div>
     
     </body>
</html> 
