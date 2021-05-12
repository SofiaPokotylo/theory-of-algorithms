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

                <fieldset>
                    <legend>Tasks(V - 15)</legend>
                    <h5>1.Improve the algorithm linearSearch and use it to analyze the text from the lab4</h5>
                    <HR width = "50%">
                    <h5>2.Generate a list of 24237 objects with fields of type String and short</h5>
                    <HR width = "50%">
                    <h5>3.Create algorithms sortApproach1 and sortApproach2 and implement them for the list from task2</h5>
                    <HR width = "50%">
                    <h5>4.Create and implement an algorithm for multithreaded linear search for List(Integer)</h5>
                </fieldset>
                
                <h2>Part1 - search the word</h2>
                
                <h3>The search word</h3>
                
                <ins>
                <h3><%=request.getAttribute("searchWord")%></h3>
                </ins>
                
                <h3>The words that consist of <%=request.getParameter("numLet")%> letters</h3>
                
                <ins>
                <h3><%=request.getAttribute("wordNumLet")%></h3>
                </ins>
                
                <h3>The words that start of the defined letter</h3>
                
                <ins>
                <h3><%=request.getAttribute("wordFirstLet")%></h3>
                </ins>
                
                <h3>The words that contain the sequence <%=request.getParameter("seq")%></h3>
                
                <ins>
                <h3><%=request.getAttribute("searchSeq")%></h3>
                </ins>
                
                <h2>Part2 - sort the list of objects</h2>
                
                <h3>Unsorted list of objects</h3>
                
                <ins>
                <h3><%=request.getAttribute("list")%></h3>
                </ins>
                
                <h3>The sorted String fields</h3>
                
                <ins>
                <h3><%=request.getAttribute("sortStr")%></h3>
                </ins>
                
                <h3>The sorted Short fields</h3>
                
                <ins>
                <h3><%=request.getAttribute("sortShr")%></h3>
                </ins>
                
                <h3>The sorted list of objects</h3>
                
                <ins>
                <h3><%=request.getAttribute("sortedList")%></h3>
                </ins>
                
                <h2>Part3 - multithreaded search</h2>
                
                <ins>
                <h3><%=request.getAttribute("mts")%></h3>
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
