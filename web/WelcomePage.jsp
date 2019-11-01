
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="NavBar.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ComicBookStore</title>
        <style>
                footer {
      background-color: #4a4740;
      color: white;
      padding: 15px;
    }
               #TableStyle
               {
                 padding-left: 5px;
                 border-collapse: collapse;
               }
    
        </style>
    </head>
    <body>
        <header>
<link href="NavBar.jsp" rel="import">                

        <div align="center">
        <h1> Welcome to ComicBookStore</h1>
        <ul>
            <li>
                <a href="SignIn.jsp"> Already a member? Sign in,here</a>
            </li> 
            <br>
            <li>
                <a href="Signup.jsp">New user? </a>
            </li>
        </ul>        
        </div>
        </header>
<footer class="container-fluid text-center">
    <table id="TableStyle" width="600">
        
        <tr>
        <th>Need Help? </th>
        <th>Company </th> 
        </tr>
        
        <tr>
            <td> <a href="#">Contact Us</a> </td>
            <td> <a href="#">About Us</a> </td> 
            
        </tr>
        
        <tr>
            <td> <a href="#">FAQs</a> </td>
            <td> <a href="#">Bulk Orders</a> </td>            
        </tr>
        
        
    </table>
    
</footer>



    </body>
</html>
