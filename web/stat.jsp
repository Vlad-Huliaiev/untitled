<%--
  Created by IntelliJ IDEA.
  User: Faraday
  Date: 20.08.2019
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prog.kiev.ua/stat</title>
</head>
<body>
<%
    String firstName = (String) request.getAttribute("user firstName");
    String lastName = (String) request.getAttribute("user lastName");
    
    out.print(firstName + " ");
    out.print(lastName + ", ");
    
    Integer jobY = (Integer) request.getAttribute("user jobY");
    Integer jobN = (Integer) request.getAttribute("user jobN");
    Integer service = (Integer) request.getAttribute("user service");
    Integer production = (Integer) request.getAttribute("user production");

    out.print("jobY : " + jobY);
    out.print("jobN : " + jobN);
    out.print("service : " + service);
    out.print("production : " + production);
%>
</body>
</html>
