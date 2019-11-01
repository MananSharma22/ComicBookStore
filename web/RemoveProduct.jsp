<%-- 
    Document   : RemoveProduct
    Created on : 11 Oct, 2019, 12:17:06 PM
    Author     : S020012001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Product</title>
    </head>
    <body style="background-color:  #e6fff7">
        <div align="center">
            <h2>Remove Product</h2>
       <form action="RemoveProductServlet" method="post">
            <table >
                <tr>
                    <td>
                       Product Name :<input type="text" name="ProductName" required>
                    </td>
              <tr>
                    <td>
                        <input type="submit" value="Delete Product">
                    </td>
                </tr>
            </table>
       </form> 
        </div>
    </body>
</html>
