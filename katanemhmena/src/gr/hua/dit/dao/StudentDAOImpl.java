package gr.hua.dit.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Form;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void makeForm(Form form) {

		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(form);
	}

}
