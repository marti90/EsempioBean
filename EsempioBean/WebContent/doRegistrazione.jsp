<%@page import="i.alfasoft.martina.service.ServizioLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


    <jsp:useBean id="utente" class="it.alfasoft.martina.UtenteBean" scope="request"/>
    <jsp:setProperty property="*" name="utente"/>
    
    
    <%
       ServizioLogin sl = new ServizioLogin();
    
       if(utente.isValid() == true){
    	   
    	   //allora l'utente è stato registrato con successo
    	   
    	   sl.registraUtente(utente);
    	   %>
    	   
    	   <jsp:forward page="RegistrazioneConSuccesso.jsp"/>
    	   
    	   <%
    	   
       }else{
    	   
    	   //torna alla pagina di registrazione
    	   
           %>
    	   
    	   <jsp:forward page="formRegistrazione.jsp"/>
    	   
    	   <%
       }
        
    
    %>