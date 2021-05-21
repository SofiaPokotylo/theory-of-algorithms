<%-- 
    Document   : lab6-7
    Created on : 14 трав. 2021 р., 03:29:07
    Author     : macbook
--%>

<%@page import="knu.fit.ist.ta.lab67.Lab67Show"%>
<%@page import="knu.fit.ist.ta.lab67.SymmetricTree"%>
<%@page import="knu.fit.ist.ta.lab67.BinaryTree"%>
<%@page import="knu.fit.ist.ta.lab67.SortClearList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Labs 6-7</title>
    </head>
    <body>
        <center>
            <FONT face ="cursive">
            <FONT size = 5>
                <h1>My labs 6-7</h1>

                <fieldset>
                    <legend>Tasks(V - 15)</legend>
                    <h5>1.Create a recursive method that counts the number of letters 'd' in a character string</h5>
                    <HR width = "50%">
                    <h5>2.Create a symmetric binary search tree from the elements {5, 8, 7, 2, 6, 10, 4, 9}</h5>
                    <HR width = "50%">
                    <h5>3.Create an iterative version of the algorithm Tree.traversePostOrder</h5>
                </fieldset>
                
                <h2>Part1 - recursion</h2>
                
                <h3>The number of letters</h3>
                
                <ins>
                <h3><%=request.getAttribute("numLet")%></h3>
                </ins>
                
                <h2>Part2 - a symmetric binary search tree</h2>
                
                <h3>Tree</h3>
                
                <ins>
                <h3><%=request.getAttribute("tree")%></h3>
                </ins>
                
                <h3>Traverse In Order</h3>
                
                <ins>
                <h3><%=request.getAttribute("treetIO")%></h3>
                </ins>
                
                <h3>Traverse Pre Order</h3>
                
                <ins>
                <h3><%=request.getAttribute("treetPO")%></h3>
                </ins>
                
                <h3>Traverse Post Order</h3>
                
                <ins>
                <h3><%=request.getAttribute("treetPostO")%></h3>
                </ins>
                
                <h3>Traverse Level Order</h3>
                
                <ins>
                <h3><%=request.getAttribute("treetLO")%></h3>
                </ins>
                
                <h3>Add the value to the tree</h3>
                
                <ins>
                <h3><%=request.getAttribute("addS")%></h3>
                </ins>
                
                <h3>Remove the value from the tree</h3>
                
                <ins>
                <h3><%=request.getAttribute("delete")%></h3>
                </ins>
                
                <h3>The presence of a certain value</h3>
                
                <ins>
                <h3><%=request.getAttribute("treeCS")%></h3>
                </ins>
                
                <h3>The smallest value in the tree</h3>
                
                <ins>
                <h3><%=request.getAttribute("smallest")%></h3>
                </ins>
                
                <h3>The largest value in the tree</h3>
                
                <ins>
                <h3><%=request.getAttribute("largest")%></h3>
                </ins>
                
                <h2>Part3 - an iterative version of Tree.traversePostOrder</h2>
                
                <ins>
                <h3><%=request.getAttribute("treetPostONotRS")%></h3>
                </ins>
                
                <%SortClearList.clearList();%>
                <%Lab67Show.setBt();%>
                
                <HR width = "50%">
                
                <div>

                    <form action="lab6-7form.jsp">

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
