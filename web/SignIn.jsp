<%-- 
    Document   : SignIn
    Created on : 2 Sep, 2019, 12:32:25 PM
    Author     : S020012001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ComicBookStore</title>
    </head>
    <body>
        <div align="center">
        <h1>Sign in</h1>
        <form action="LoginServlet" method="post">
        <table>
            <tr>
                <td>
                    Email:<input type="email" name="email" >
                </td>
            </tr>
            <tr>
                <td>
                    Password:<input type="password" name="password" >
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Sign In">
                </td>
            </tr>
            
        </table>
         </form>   
        </div>
    </body>
</html>
