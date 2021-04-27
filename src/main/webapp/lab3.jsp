<%-- 
    Document   : lab3
    Created on : 15 квіт. 2021 р., 17:25:40
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3</title>
    </head>
    <body>
        <center>
            <FONT face ="cursive">
            <FONT size = 5>
                <h1>My lab3</h1>

                <h2>Task10: "Fill in an array of different k natural numbers. Find the three largest numbers."</h2>
                
                <h5><%=request.getAttribute("initial")%></h5>
                <h5><%=request.getAttribute("shuffled")%></h5>
                
                <ins>
                <h2><%=request.getAttribute("array")%></h2>
                <h2><%=request.getAttribute("theLargest")%></h2>
                </ins>
                
                <HR width = "50%">
                
                <div>

                    <form action="lab3form.jsp">

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
