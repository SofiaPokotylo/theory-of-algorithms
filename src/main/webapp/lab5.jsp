<%-- 
    Document   : lab5
    Created on : 29 квіт. 2021 р., 23:32:42
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        <center>
            <FONT face ="cursive">
            <FONT size = 5>
                <h1>My lab5</h1>

                <h2>Task1: "Fill in an array of different k natural numbers. Find the three largest numbers."</h2>
                
                <ins>
                <h2><%=request.getAttribute("index")%></h2>
                </ins>
                
                
                
                <HR width = "50%">
                
                <div>

                    <form action="lab5form.jsp">

                    <input type="submit" value="New values">

                    </form>

                </div>

                <HR width = "50%">

                <div>

                    <form action="index.jsp">

                    <input type="submit" value="Home">

                    </form>

                </div>

                <HR width = "50%">
                
            </FONT>
            </FONT>
        </center>
    </body>
</html>
