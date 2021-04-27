<%-- 
    Document   : lab2form
    Created on : 9 квіт. 2021 р., 13:40:23
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2 input</title>
    </head>
    <body>
        
    <center>
        <FONT face ="cursive">
        <FONT size = 5>
        <h1>Insert x!</h1>
        
        <div>
        
            <form action="./lab2" method="post">
                
                <input type="text" name="x" placeholder="Enter x as ##.###"/>
            
                <input type="submit" value="Ok"/>
        
            </form>
           
        </div>
        </FONT>
        </FONT>
    </center>
        
    </body>
</html>
