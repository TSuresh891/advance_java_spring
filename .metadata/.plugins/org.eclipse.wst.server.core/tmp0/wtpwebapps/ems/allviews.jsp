<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>All Employees</h1>
  <!-- <h3>${al}</h3> 
    this line is used to execute in single line 
  --> 
  <table border="1" cellspacing="15px" cellpadding="15px" style="border-collapse: collapse">
      <tr>
         <th>Id</th>
         <th>Name</th>
         <th>Job</th>
         <th>Salary</th>
      </tr>
      <c:forEach var="e" items ="${al}">
           <tr>
           <td>${e.getId()}</td>
           <td>${e.getName()}</td>
           <td>${e.getJob()}</td>
           <td>${e.getSal()}</td>
           </tr>
 
      </c:forEach>
  
  </table>
  
</body>
</html>