package it.alfasoft.martina.service;

import java.util.List;

import it.alfasoft.martina.UtenteBean;
import it.alfasoft.martina.dao.UtenteDAO;


public class ServizioLogin {
	
	//boolean UtenteIsValid
	
	private UtenteDAO uDao = new UtenteDAO();
	
	public boolean registraUtente(UtenteBean u){
		
		boolean res = false;
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
	
	public UtenteBean getUtenteConUsername(String username){
		
		UtenteBean u = uDao.readUtente(username);
		
		return u;
	}
	
	public List<UtenteBean> getTuttiUtenti(){
		
		return uDao.readUtenti();
	}

}
