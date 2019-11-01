
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:  #e6fff7 ">
        <div align="center" style="background-color:lightblue">
            <h1>Admin page</h1>
        </div>
        
        <div align="center">
            <h2> Add Product</h2>
            <form action="ProductServlet" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>
                       Product Name :<input type="text" name="ProductName" required>
                    </td>
                </tr> 
                <tr>
                    <td>
                       Product Category:<input type="text" name="ProductCategory" required>
                    </td>
                </tr>
                <tr>
                    <td>
                       Product Price:<input type="text" name="ProductPrice" required>
                    </td>
                </tr> 
                <tr>
                    <td>
                       Add Image:<input type="file" name="myfile" required >
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <input type="submit" value="Add Image">
                    </td>
                </tr>
                
            </table>
        </form> 
        </div>
                <div align="center">                   
                   <a href ="RemoveProduct.jsp"> Remove Product</a>                 
                   <a href="UpdateProducts.jsp"> Update Products</a>
                </div>  
    </body>
</html>
