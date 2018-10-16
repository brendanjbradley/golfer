<%@page import="goldnow.Player"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Golf Now</title>
</head>
<h1>Welcome to the live Leaderboard</h1>
<table border = "1" style = "width:100%"> 

    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Strokes</th>
        <th>Country</th>
    </tr>
    

        <tr>
            <td><%= %></td>
            <td><%= new Player().getLastName() %></td>
            <td><%= new Player().getStrokes() %></td>
            <td><%= new Player().getCountry() %></td>


        </tr>


</table>
<body>

</body>
</html>

