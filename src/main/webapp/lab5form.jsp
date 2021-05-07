<%-- 
    Document   : lab5form
    Created on : 29 квіт. 2021 р., 23:43:14
    Author     : macbook
--%>

<%@page import="knu.fit.ist.ta.lab5.SortSearch"%>
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
            <%!SortSearch sortSearch = new SortSearch();%>
            <FONT face ="cursive">
            <FONT size = 5>
                <h1>Insert the word to find!</h1>
            </FONT> 
            <h2></h2>
            
          
        <div>
        
            <form action="./lab5" method="post">
                
                <h2>Enter the word to look for, the first letter of the search words, or the length of the search words</h2>
                
                <input type="text" name="word" placeholder="Enter the word"/>
                
                <h3>If you want to look for the words that contain some sequence of letters, enter the sequence</h3>
                
                <input type="text" name="seq" placeholder="Enter the sequence"/>
                
                <h2>Not necessarily!</h2>
                
                <h3>If you want to look for a word that starts from the defined letter, enter the start index</h3>
                
                <h2>The indices</h2>
                <h2><%=sortSearch.startNum(sortSearch.sortApproach3(text.cleanText(text.text)))%></h2>
                
                <input type="text" name="start" placeholder="Enter the start index"/>
                
                <h3>...or the start and the finish(the start index of the next letter) indices</h3>
                
                <input type="text" name="finish" placeholder="Enter the finish index"/>
                
                <input type="submit" value="Ok"/>
        
            </form>
           
        </div>
        
        <h4>Text</h4>
        
        <%=text.cleanText(text.text)%>
        
        <h4>The sorted text</h4>
        
        <%=sortSearch.sortApproach3(text.cleanText(text.text))%>
        
        <h4>The number of words(T2)</h4>
            
        <%=text.sizeOfList(text.cleanText(text.text))%>
        
      
        
        </FONT>
        </FONT>
        </center>
    </body>
</html>
