<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>
</head>
<body>
  <h1>Welcome To Sunday ems </h1>
  
  <fieldset>
  <legend>Enter date to register</legend>
  <form action="save">
  <input type="text" placeholder="Enter Name" name="name"><br><br>
  <input type="text" placeholder="Enter JOb" name="job"><br><br>
  <input type="text" placeholder="Enter salary" name="salary"><br><br>
  <button type="submit">Submit</button><br><br>
  </fieldset>
  </form>
  
  <a href="findAll"> <button>view All</button></a>
</body>
</html>