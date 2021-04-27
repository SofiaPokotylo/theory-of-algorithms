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
            
            <FONT size = 5>
            <FONT face ="cursive">
                <h1>My lab2</h1>
                
                <h2>Task: "Solve the equation (&#8730(d&#215x))/(a&#215x&#178+
                    b&#215x+c)"</h2>
                <h3>a = -5&#8195b = 1&#8195c = 7&#8195d = 8</h3>
                <h3><%=request.getAttribute("step1")%></h3>
                <h3><%=request.getAttribute("step2")%></h3>
                <ins>
                    <h2><%=request.getAttribute("result")%></h2>
                </ins>
            </FONT>
            </FONT>

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
              
        </center>
    </body>
</html>
