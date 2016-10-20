package it.alfasoft.martina.utility;

import java.io.Serializable;

public class ErroreBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ErroreBean(){
		
	}

	private String erroreLogin="";
	
	public String getErroreLogin() {
		return erroreLogin;
	}

	public void setErroreLogin(String erroreLogin) {
		this.erroreLogin = erroreLogin;
	}

}
