package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Food;

@Repository
public class FoodDAOImpl implements FoodDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Food> getFoods() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Food> query = currentSession.createQuery("from food order by lastName", Food.class);

		List<Food> foods = query.getResultList();

		return foods;
	}

	@Override
	public void saveFood(Food food) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(food);
	}

	@Override
	public void deleteFood(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Food food = currentSession.get(Food.class, id);

		currentSession.delete(food);
	}

	@Override
	public Food getFood(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Food.class, id);
	}

}
