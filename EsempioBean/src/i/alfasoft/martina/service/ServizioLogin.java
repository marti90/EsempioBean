package i.alfasoft.martina.service;

import it.alfasoft.martina.UtenteBean;
import it.alfasoft.martina.dao.UtenteDAO;


public class ServizioLogin {
	
	//boolean UtenteIsValid
	
	//Utente getUtenteConUsername
	
	//getTuttiUtenti
	
	UtenteDAO uDao = new UtenteDAO();
	
	public boolean registraUtente(String nome, String cognome, String username, String password){
		
		boolean res = false;
		UtenteBean u = new UtenteBean(nome,cognome,username,password);
		res = uDao.createUtente(u);
		
		return res;
	}
	
	public boolean esisteUtente(String username, String password){
		
		boolean res = false;
		UtenteBean u = uDao.readUtente(username, password);
		if(u!=null){
			res = true;
		}
		
		return res;
	}

}
