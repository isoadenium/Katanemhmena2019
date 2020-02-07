package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Points;

@Repository
public class PointDAOImpl implements PointsDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Points> getPointss() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Points> query = currentSession.createQuery("from points order by lastName", Points.class);

		List<Points> points = query.getResultList();

		return points;
	}

	@Override
	public void savePoints(Points points) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(points);
	}

	@Override
	public void deletePoints(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Points points = currentSession.get(Points.class, id);

		currentSession.delete(points);
	}

	@Override
	public Points getPoints(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Points.class, id);
	}

}
