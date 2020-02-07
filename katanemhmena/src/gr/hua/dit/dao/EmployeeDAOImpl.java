package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Employee> getEmployees() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Employee> query = currentSession.createQuery("from employee order by lastName", Employee.class);

		List<Employee> employees = query.getResultList();

		return employees;
	}

	@Override
	public void saveEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Employee employee = currentSession.get(Employee.class, id);

		currentSession.delete(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Employee.class, id);
	}

}
