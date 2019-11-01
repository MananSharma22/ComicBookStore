
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:#e6fff7">
        <div align='center'>
            <h2> Enter Details to Update Product Name and Price:</h2>
            <form action='UpdateProductServlet' method='post'>
                <table>
                <tr>    
                    <td>
                    What will be the new Product Name :<input type="text" name="ProductName" required>
                    </td>
                </tr>
                <tr>
                    <td>
                    What will be the new Product Price:<input type="text" name="ProductPrice" required>
                    </td>
                </tr>
                <br>
                <tr>
                    <td>
                        Category of the Product:<input type="text" name="ProductCategory" required>
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
    </body>
</html>
