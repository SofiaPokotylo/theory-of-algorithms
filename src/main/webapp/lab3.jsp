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
            <FONT face ="fantasy">
            <FONT size = 5>
                <h1>This is my lab3!</h1>

                <p><%=request.getAttribute("result")%></p>
                
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
