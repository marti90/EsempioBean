package it.alfasoft.martina;

import java.io.Serializable;

public class UtenteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	
	public UtenteBean(){
		
	}
	
	public UtenteBean(String nome, String cognome, String username, String password) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
