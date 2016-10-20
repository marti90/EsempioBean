<%@page import="java.io.PrintWriter"%>
<%@page import="it.alfasoft.martina.service.ServizioLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="error" class="it.alfasoft.martina.utility.ErroreBean" scope="request"/>
<jsp:useBean id="utente" class="it.alfasoft.martina.UtenteBean" scope="session"/>
<jsp:setProperty property="*" name="utente"/>
   <%

    ServizioLogin sl = new ServizioLogin();
   
    if(request.getParameter("call")==null){
    	
    	%>
    	<jsp:forward page="Login.jsp"></jsp:forward>
    	<%
    	
    } else{
    
       boolean res = sl.esisteUtente(utente.getUsername(), utente.getPassword());
    
       if(res == false){
    	   RequestDispatcher rd1 = request.getRequestDispatcher("Login.jsp");
           error.setErroreLogin("Username o Password ERRATI!"); 
   
    	   rd1.forward(request, response);
       } else {
    	   RequestDispatcher rd2 = request.getRequestDispatcher("Welcome.jsp");
    	   rd2.forward(request, response);
       }
    }

%>