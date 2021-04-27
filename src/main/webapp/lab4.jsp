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
            <FONT face ="cursive">
            <FONT size = 5>
                <h1>My lab4</h1>

                <%!Text text = new Text();%>
                <fieldset>
                <legend>Tasks(V - 15)</legend>
                <h5>1.Cleaning a text</h5>
                <HR width = "50%">
                <h5>2.Determine the total number of words in the text</h5>
                <HR width = "50%">
                <h5>3.Determine a number of unique words in the text</h5>
                <HR width = "50%">
                <h5>4.Determine the first 7 most common words</h5>
                <HR width = "50%">
                <h5>5.Determine the number of words that do not contain the letter "u"</h5>
                <HR width = "50%">
                <h5>6.Determine the number of words that have exactly 4 letters</h5>
                <HR width = "50%">
                <h5>7.Determine the first 6 the most common three-letter sequences
                    in words in the text</h5>
                </fieldset>
                
                <h4>Text</h4>
                <%=text.text%>
                <h4>Clean text(T1)</h4>
                <ins>
                <%=text.cleanText(text.text)%>
                </ins>
                <h4>List</h4>
                <%=text.getList(text.cleanText(text.text))%>
                <h4>The number of words(T2)</h4>
                <ins>
                <%=text.sizeOfList(text.cleanText(text.text))%>
                </ins>
                <h4>Set</h4>
                <%=text.getSet(text.cleanText(text.text))%>
                <h4>The number of unique words(T3)</h4>
                <ins>
                <%=text.sizeOfSet(text.cleanText(text.text))%>
                </ins>
                <h4>The first 7 most common words(T4)</h4>
                <h5>[word] - [frequency of occurrence]</h5>
                <ins>
                <%=text.first7Often(text.cleanText(text.text))%>
                </ins>
                <h4>The number of words that do not contain the letter "u"(T5)</h4>
                <ins>
                <%=text.notU(text.cleanText(text.text))%>
                </ins>
                <h4>The number of words that have exactly 4 letters(T6)</h4>
                <ins>
                <%=text.words4Letters(text.cleanText(text.text))%>
                </ins>
                <h4>The first 6 the most common 3-letter sequences(T7)</h4>
                <h5>[sequence] - [frequency of occurrence]</h5>
                <ins>
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

