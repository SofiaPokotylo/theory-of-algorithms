<%-- 
    Document   : lab4.jsp
    Created on : 22 квіт. 2021 р., 00:54:28
    Author     : macbook
--%>

<%@page import="knu.fit.ist.ta.lab4.Text"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 4</title>
    </head>
    <body>
        <center>
            <FONT face ="fantasy">
            <FONT size = 5>
                <h1>My lab4</h1>

                <%!Text text = new Text();%>
                
                <h2>Task: "Solve the equation (&#8730(d&#215x))/(a&#215x&#178+
                    b&#215x+c)"</h2>
                <ins>
                    <%=text.text%>
                    <h4>Cleaned text</h4>
                    <%=text.cleanText(text.text)%>
                    <h4>List</h4>
                    <%=text.getList(text.cleanText(text.text))%>
                    <h4>The number of words</h4>
                    <%=text.sizeOfList(text.cleanText(text.text))%>
                    <h4>Set</h4>
                    <%=text.getSet(text.cleanText(text.text))%>
                    <h4>The number of unique words</h4>
                    <%=text.sizeOfSet(text.cleanText(text.text))%>
                    <h4>The first word, that is the most often used</h4>
                    <%=text.first7Often(text.cleanText(text.text))%>
                    <h4>The number of words, which don't have u</h4>
                    <%=text.notU(text.cleanText(text.text))%>
                    <h4>The number of words, which consist of 4 letters</h4>
                    <%=text.words4Letters(text.cleanText(text.text))%>
                    <h4>The first 3-letter sequence</h4>
                    <%=text.seq3Let(text.cleanText(text.text))%>
                </ins>

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

