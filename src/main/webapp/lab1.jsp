<%-- 
    Document   : lab1
    Created on : 4 квіт. 2021 р., 03:44:41
    Author     : macbook
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
    <center>
        <FONT face ="cursive">
        <FONT size = 5>
        <h1>This is my lab1</h1>
        
        <h3>Task: "Perform basic operations and display the result on the page"</h3>
        
        <%!MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>
        
        <%
           int x = mFJC.getMyInt();
           
        %>
        
        <p>x = <%=x%></p>
        
        <%x += 3;%>
        
        <p>x = x+3 = <%=x%></p>
        
        <%x %= 3;%>
        
        <p>The remainder of division x by 3 = <%=x%></p>
        
        <a href="index.jsp">Home</a>
        </FONT>
        </FONT>
    </center>
    </body>
</html>
