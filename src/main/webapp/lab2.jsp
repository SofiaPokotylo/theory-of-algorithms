<%-- 
    Document   : lab2
    Created on : 8 квіт. 2021 р., 21:34:17
    Author     : macbook
--%>

<%@page import="knu.fit.ist.ta.lab2.MyEquation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
    </head>
    <body>
        
        <center>
            <FONT face ="fantasy">
            <FONT size = 5>
                <h1>This is my lab2!</h1>

                <p><%=request.getAttribute("result")%></p>


                <div>

                    <form action="lab2form.jsp">

                    <input type="submit" value="New x">

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
