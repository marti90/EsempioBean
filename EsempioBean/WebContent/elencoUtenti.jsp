<%@page import="it.alfasoft.martina.UtenteBean"%>
<%@page import="it.alfasoft.martina.dao.UtenteDAO"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  
<h1>Elenco Utenti</h1>

    <table border="1px">
         <thead>
             <tr>
                 <th>n.</th>
                 <th>nome</th>
                 <th>cognome</th>
             </tr>
         </thead>
         
         <%
         UtenteDAO uDao = new UtenteDAO();
         int i =1;
         for(UtenteBean u : uDao.readUtenti()){ %>
         
             <tr>
                 <td><%out.println(i);%> </td>
                 <td>${u.nome}</td>
                 <td><%=u.getCognome()%> </td>
          
         
         <%
         i++;
         }
         %>


         </tr>


   </table>

</body>
</html>