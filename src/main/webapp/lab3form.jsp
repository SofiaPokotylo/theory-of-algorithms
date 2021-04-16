<%-- 
    Document   : lab3form
    Created on : 15 квіт. 2021 р., 19:26:19
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3 input</title>
    </head>
    
    <body>
        
        <center>
            
            <FONT face ="fantasy">
            <FONT size = 5>
                <h1>Insert values!</h1>
            </FONT>  
            <FONT size = 3>
                <h3>k - the number of elements of the array</h3>
                <h3>n - the desired range of natural numbers</h3>
                <h3>s - seed for the random function</h3>
            </FONT>
        <div>
        
            <form action="./lab3" method="post">
                
                <input type="text" name="k" placeholder="Enter natural k"/>
            
                <input type="text" name="n" placeholder="Enter natural n"/>
                
                <input type="text" name="s" placeholder="Enter integer s"/>
                
                <input type="submit" value="Ok"/>
        
            </form>
           
        </div>
        </FONT>
        </FONT>
    </center>
        
    </body>
</html>
