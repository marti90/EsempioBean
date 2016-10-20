<%@page import="i.alfasoft.martina.service.ServizioLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <%

    ServizioLogin sl = new ServizioLogin();

    String user= request.getParameter("username");
    String password= request.getParameter("password");
    
    boolean res = sl.esisteUtente(user, password);
    
    if(res == false){
    	RequestDispatcher rd1 = request.getRequestDispatcher("formRegistrazione.jsp");
    	System.out.println("Attenzione, non sei ancora registrato al sito. Effettua la registrazione!");
    	rd1.include(request, response);
    } else {
    	RequestDispatcher rd2 = request.getRequestDispatcher("Welcome.jsp");
    	rd2.forward(request, response);
    }

%>