package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Departement;

@Repository
public class DepartementDAOImpl implements DepartementDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Departement> getDepartements() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Departement> query = currentSession.createQuery("from deps order by lastName", Departement.class);

		List<Departement> departements = query.getResultList();

		return departements;
	}

	@Override
	public void saveDepartement(Departement departement) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(departement);
	}

	@Override
	public void deleteDepartement(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Departement departement = currentSession.get(Departement.class, id);

		currentSession.delete(departement);
	}

	@Override
	public Departement getDepartement(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Departement.class, id);
	}

}
