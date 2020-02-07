package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Check;

@Repository
public class CheckDAOImpl implements CheckDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Check> getChecks() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Check> query = currentSession.createQuery("from formcheck order by lastName", Check.class);

		List<Check> checks = query.getResultList();

		return checks;
	}

	@Override
	public void saveCheck(Check check) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(check);
	}

	@Override
	public void deleteCheck(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Check check = currentSession.get(Check.class, id);

		currentSession.delete(check);

	}

	@Override
	public Check getCheck(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Check.class, id);
	}

}
