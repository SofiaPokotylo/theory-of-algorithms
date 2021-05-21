<%-- 
    Document   : lab6-7form
    Created on : 14 трав. 2021 р., 03:30:53
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Labs 6-7 input</title>
    </head>
    <body>
    <center>
        <FONT face ="cursive">
                <FONT size = 5>
                    <h1>Insert the values</h1>
                </FONT> 
            
                <div>
   
                    <form action="./lab6-7" method="post">
                
                    <h1>Part1 "Recursion"</h1>
                    
                    <FONT face ="times new roman">
                
                        <h2>Please, enter a character string</h2>
                
                        <input type="text" name="str" placeholder="Enter a character string"/>
                
                    </FONT>
                
                    <h2>Not necessarily!</h2>
                
                    <FONT face ="times new roman">
                
                        <h3>If you want to count the number of letters in a certain part of the string, enter the index</h3>
                
                        <input type="text" name="ind" placeholder="Enter the index"/>
                        
                        <h3>If you want to count the number of characters (not 'd'), enter the character</h3>
                
                        <input type="text" name="ch" placeholder="Enter the character"/>
                
                    </FONT>
                    
                     <h1>Part2-3 "Tree"</h1>
                    
                    <FONT face ="times new roman">
                        
                        <h2>Please, enter the value you want to add to the tree</h2>
                
                        <input type="text" name="add" placeholder="Enter int value"/>
                        
                        <h2>Please, enter the value you want to remove from the tree</h2>
                
                        <input type="text" name="del" placeholder="Enter int value"/>
                        
                        <h2>Please, enter the value you want to check whether it is in the tree</h2>
                
                        <input type="text" name="cont" placeholder="Enter int value"/>
                        
                    </FONT>
                        
                    <h2>Not necessarily!</h2>
                        
                    <FONT face ="times new roman">
                        
                        <h2>Please, enter int values(through a space)</h2>
                
                        <input type="text" name="nodes" placeholder="Enter int values"/>
                        
                
                    </FONT>
                    
                    <h2></h2>
                
                    <input type="submit" value="Ok"/>
        
                    </form>
           
                </div>
      
            </FONT>
    </center>
    </body>
</html>
