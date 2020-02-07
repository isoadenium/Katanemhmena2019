package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Form;

@Repository
public class FormDAOImpl implements FormDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Form> getForms() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Form> query = currentSession.createQuery("from formcheck order by lastName", Form.class);

		List<Form> forms = query.getResultList();

		return forms;
	}

	@Override
	public void saveForm(Form form) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(form);
	}

	@Override
	public void deleteForm(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Form form = currentSession.get(Form.class, id);

		currentSession.delete(form);
	}

	@Override
	public Form getForm(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Form.class, id);
	}

}
