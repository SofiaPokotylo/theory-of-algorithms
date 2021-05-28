<%-- 
    Document   : lab8form
    Created on : May 24, 2021, 11:44:46 PM
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 8 input</title>
    </head>
    <body>
        <center>
        <FONT face ="cursive">
                <FONT size = 5>
                    <h1>Insert the value</h1>
                </FONT> 
            
                <div>
   
                    <form action="./lab8" method="post">
                
                    <h1>Please, enter the number of tickets</h1>
                    
                    <input type="text" name="num" placeholder="Enter a character string"/>
                    
                     <h2>Not necessarily!</h2>
                     
                    <FONT face ="times new roman">
                
                        <h2>If you wish, enter another number of tickets that provide
                            the opportunity to participate in the jackpot</h2>
                
                        <input type="text" name="jack" placeholder="Enter the integer value"/>
                
                    </FONT>
                    
                    <h2></h2>
                
                    <input type="submit" value="Ok"/>
        
                    </form>
           
                </div>
      
            </FONT>
    </center>
    </body>
</html>
