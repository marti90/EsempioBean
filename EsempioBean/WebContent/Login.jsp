<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Benvenuto</title>
</head>
<body>

     <h1>Login Page</h1>
     <form action="doLogin.jsp" method="post">
     
        Username: <input type= "text" name="username"/><br>
        Password: <input type= "password" name="password"/><br>
         
         <input type= "submit" value="Entra"/>
    
    </form>
    
    <a href="formRegistrazione.jsp">Pagina Registrazione</a>

</body>
</html>