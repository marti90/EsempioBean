package it.alfasoft.martina.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.alfasoft.martina.UtenteBean;
import it.alfasoft.martina.utility.HibernateUtility;


public class UtenteDAO {
	
	//1- CREATE
	public boolean createUtente(UtenteBean u){
			
		boolean res = false;
			
		Session session = HibernateUtility.openSession();
		Transaction tx = null;
			
		try{
			tx = session.getTransaction();
			tx.begin();
				
			session.persist(u);
			
			tx.commit();
			res= true;
			
		}catch(Exception ex){
			tx.rollback();
				
		}finally{
			session.close();
				
		}
			
		return res;
	}
	
	//2.a- READ con username
	public UtenteBean readUtente(String username){
			
		UtenteBean u = null;
			
		Session session = HibernateUtility.openSession();
		Transaction tx = null;
			
		try{
			tx = session.getTransaction();
			tx.begin();
			
			u = session.get(UtenteBean.class, username);
				
			tx.commit();
				
		}catch(Exception ex){
			tx.rollback();
				
		}finally{
				session.close();
				
		}
		
		return u;
	}
		
	//2.a- READ con id
	public UtenteBean readUtente(long id_utente){
		
		UtenteBean u = null;
		
		Session session = HibernateUtility.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			u = session.get(UtenteBean.class, id_utente);
			
			tx.commit();
			
		}catch(Exception ex){
			tx.rollback();
			
		}finally{
			session.close();
			
		}
		
		return u;
	}
	
	//2.b- READ con username e password
	public UtenteBean readUtente(String username, String password){
		
		UtenteBean u = null;
		
		Session session = HibernateUtility.openSession();
        Transaction tx = null;
        Query query = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			query = session.createQuery("from Utente where username =:usernameInserito and password =:passwordInserita");
			query.setString("usernameInserito", username);
			query.setString("passwordInserita", password);
			u = (UtenteBean) query.uniqueResult();
			
			tx.commit();
			
		}catch(Exception ex){
			tx.rollback();
			
		}finally{
			session.close();
			
		}
		
		return u;
	}
	
	//3- UPDATE
	public boolean updateUtente(UtenteBean u){

		boolean res = false;
		
		Session session = HibernateUtility.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			session.update(u);
			
			tx.commit();
			res= true;
			
			
		}catch(Exception ex){
			tx.rollback();
			
		}finally{
			session.close();
			
		}
		
		return res;
		
	}
	
	//4- DELETE
	public boolean deleteUtente(UtenteBean u){
        
		boolean res = false;
		
		Session session = HibernateUtility.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			session.delete(u);
			
			tx.commit();
			res= true;
			
		}catch(Exception ex){
			tx.rollback();
			
		}finally{
			session.close();
			
		}
		
		return res;
		
	}

}