<%-- 
    Document   : lab8
    Created on : May 24, 2021, 11:41:48 PM
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 8</title>
    </head>
    <body>
        
        <center>
            <FONT face ="cursive">
            <FONT size = 5>
                <h1>My lab 8</h1>

                <fieldset>
                    <legend>Task</legend>
                    <h4>Lottery tickets were issued with four-digit numbers,
                        the first digit of which is not equal to 0. Winning 
                        are those tickets in which the modulus of difference 
                        of 4 and 2 digits is 2. In addition, the first 5 winning 
                        tickets, the sum of all digits of which is the smallest,
                        allow their owners to take participation in the jackpot draw. 
                        Make a list of these 5 winning tickets.</h4>
                </fieldset>
                
                <h2>Part1 - the list of the winning tickets</h2>
                
                <ins>
                <h3><%=request.getAttribute("winTick")%></h3>
                </ins>
                
                <h2>Part2 - Radix Sort</h2>
                
                <h3>Radix Sort with the additional list of the sums</h3>
                
                <ins>
                <h3><%=request.getAttribute("radixL")%></h3>
                </ins>
                
                <h3>Radix Sort with recursion</h3>
                
                <ins>
                <h3><%=request.getAttribute("radix")%></h3>
                </ins>
                
                <h2>Part3 - Quick Sort</h2>
                
                <h3>Quick Sort with the additional list of the sums</h3>
                
                <ins>
                <h3><%=request.getAttribute("quickL")%></h3>
                </ins>
                
                <h3>Quick Sort with recursion</h3>
                
                <ins>
                <h3><%=request.getAttribute("quick")%></h3>
                </ins>
                
                <h2>Part5 - Jackpot tickets</h2>
                
                <ins>
                <h3><%=request.getAttribute("jackpot")%></h3>
                </ins>
                
                <h2>Examples with different number of tickets</h2>
                
                <ins>
                <h3><%=request.getAttribute("winTick1")%></h3>
                </ins>
                
                <h3>Algorithm: Radix Sort</h3>
                
                <h3>With list</h3>
                
                <ins>
                <h3><%=request.getAttribute("radixL1")%></h3>
                </ins>
                
                <h3>Without list</h3>
                
                <ins>
                <h3><%=request.getAttribute("radix1")%></h3>
                </ins>
                
                <h3>Algorithm: Quick Sort</h3>
                
                <h3>With list</h3>
                
                <ins>
                <h3><%=request.getAttribute("quickL1")%></h3>
                </ins>
                
                <h3>Without list</h3>
                
                <ins>
                <h3><%=request.getAttribute("quick1")%></h3>
                </ins>
                
                <h3>Jackpot</h3>
                
                <ins>
                <h3><%=request.getAttribute("jackpot1")%></h3>
                </ins>
                
                <h3>Algorithms: recursive and iterative</h3>
                
                <ins>
                <h3><%=request.getAttribute("winTick2")%></h3>
                </ins>
                
                <h3>Algorithm: Radix Sort</h3>
                
                <h3>With list</h3>
                
                <ins>
                <h3><%=request.getAttribute("radixL2")%></h3>
                </ins>
                
                <h3>Without list</h3>
                
                <ins>
                <h3><%=request.getAttribute("radix2")%></h3>
                </ins>
                
                <h3>Algorithm: Quick Sort</h3>
                
                <h3>With list</h3>
                
                <ins>
                <h3><%=request.getAttribute("quickL2")%></h3>
                </ins>
                
                <h3>Without list</h3>
                
                <ins>
                <h3><%=request.getAttribute("quick2")%></h3>
                </ins>
                
                <h3>Jackpot</h3>
                
                <ins>
                <h3><%=request.getAttribute("jackpot2")%></h3>
                </ins>
                
                <h3>Algorithms: recursive and iterative</h3>
                
                <ins>
                <h3><%=request.getAttribute("winTick3")%></h3>
                </ins>
                
                <h3>Algorithm: Radix Sort</h3>
                
                <h3>With list</h3>
                
                <ins>
                <h3><%=request.getAttribute("radixL3")%></h3>
                </ins>
                
                <h3>Without list</h3>
                
                <ins>
                <h3><%=request.getAttribute("radix3")%></h3>
                </ins>
                
                <h3>Algorithm: Quick Sort</h3>
                
                <h3>With list</h3>
                
                <ins>
                <h3><%=request.getAttribute("quickL3")%></h3>
                </ins>
                
                <h3>Without list</h3>
                
                <ins>
                <h3><%=request.getAttribute("quick3")%></h3>
                </ins>
               
                <h3>Jackpot</h3>
                
                <ins>
                <h3><%=request.getAttribute("jackpot3")%></h3>
                </ins>
                
                
                <div>

                    <form action="lab8form.jsp">

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
