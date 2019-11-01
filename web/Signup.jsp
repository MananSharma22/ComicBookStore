<%-- 
    Document   : Signup
    Created on : 2 Sep, 2019, 3:59:21 PM
    Author     : S020012001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div align="center">
            <h1>SignUp Here</h1>
            <form action="RegisterServlet" method="post">
                <table>
                <tr>
                    <td>First Name:<input type="text" name="fname"></td>
                </tr>
                
                <tr>
                    <td>Last Name:<input type="text" name="lname"></td><br>
                </tr>
                
                <tr>
                    <td>Email id:<input type="email" name="email"></td><br>
                </tr>
                
                <tr>
                    <td>Password:<input type="password" name="password"></td><br>
                </tr>
                
                <tr>
                    <td><input type ="submit"></td>
                </tr>
                </table>
            </form>
        </div>
    </body>
</html>
