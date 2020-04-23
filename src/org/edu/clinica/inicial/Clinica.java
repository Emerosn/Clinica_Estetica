package org.edu.clinica.inicial;

import org.edu.clinica.clases.Pessoa;
import org.edu.clinica.util.HibernateUtil;
import org.hibernate.Session;

public class Clinica {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		p.setNome("Amanda");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}

}
