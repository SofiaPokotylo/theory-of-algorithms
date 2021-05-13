<%-- 
    Document   : lab5form
    Created on : 29 квіт. 2021 р., 23:43:14
    Author     : macbook
--%>


<%@page import="knu.fit.ist.ta.lab4.Text"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5 input</title>
    </head>
    <body>
        <center>
            <%!Text text = new Text();%>
            
            <FONT face ="cursive">
                <FONT size = 5>
                    <h1>Insert the values</h1>
                </FONT> 
            
                <div>
   
                    <form action="./lab5" method="post">
                
                    <h1>Part1 "Word"</h1>
                
                    <h2>Text</h2>
        
                    <%=text.cleanText(text.text)%>
                    
                    <h2>The number of words - <%=text.sizeOfList(text.cleanText(text.text))%></h2>
                
                    <FONT face ="times new roman">
                
                        <h2>Enter the search word</h2>
                
                        <input type="text" name="word" placeholder="Enter the word"/>
                
                    </FONT>
                
                    <h2>Not necessarily!</h2>
                
                    <FONT face ="times new roman">
                
                        <h3>If you want to look for a word in a certain part of the text, enter the start index,
                        the finish index, or the start and the finish indices</h3>
                
                        <input type="text" name="start" placeholder="Enter the start index"/>
                
                        <input type="text" name="finish" placeholder="Enter the finish index"/>
                
                    </FONT>
              
                    <h1>Part2 "Sort objects"</h1>
                
                    <FONT face ="times new roman">
                
                        <h2>Enter the number of objects</h2>
                
                        <input type="text" name="num" placeholder="Enter the number of objects"/>
                
                    </FONT>
                
                    <h1>Part3 "Multithreaded search"</h1>
                
                    <FONT face ="times new roman">
                
                        <h2>Enter the number of the threads</h2>
                
                        <input type="text" name="threads" placeholder="Enter the number of the threads"/>
                
                        <h2>Enter the search integer value</h2>
                
                        <input type="text" name="intp" placeholder="Enter the int value"/>
                
                        <h2></h2>
                
                        <input type="submit" value="Ok"/>
                
                    </FONT>
        
                    </form>
           
                </div>
      
            </FONT>
        </center>
    </body>
</html>
