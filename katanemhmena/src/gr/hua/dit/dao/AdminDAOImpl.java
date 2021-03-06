package gr.hua.dit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import gr.hua.dit.entity.Admin;
import javax.transaction.Transactional;

import org.hibernate.Session;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	// @Transactional
	public void addAdmin(Admin admin) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(admin);

	}

//	@Override
//	@Transactional
//	public void addStudent(Student student) {
//		Session session = sessionFactory.getCurrentSession();
//
//		// session.beginTransaction();
//
//		Departement dep = session.get(Departement.class, student.getDep().getDep_id());
//
//		dep.addStudent(student);
//
//		session.save(student);
//
//		// session.getTransaction().commit();
//
//		// System.out.println("Done!");
//
//	}

//	@Override
//	@Transactional
//	public void addEmployee(Employee employee) {
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		currentSession.save(employee);
//
//	}

	@Override
	@Transactional
	public void deleteAdmin(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Admin admin = currentSession.get(Admin.class, id);

		currentSession.delete(admin);

	}

//	@Override
//	@Transactional
//	public void deleteStudent(Student student) {
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		Departement dep = currentSession.get(Departement.class, student.getDep().getDep_id());
//		dep.delStudent(student);
//		
//		currentSession.delete(student);
//
//	}

//	@Override
//	@Transactional
//	public void deleteEmployee(Employee employee) {
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		currentSession.delete(employee);
//
//	}

	@Override
	@Transactional
	public void alterAdmin(Admin admin) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.update(admin);

	}

//	@Override
//	@Transactional
//	public void alterStudent(Student student) {
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		Departement dep = currentSession.get(Departement.class, student.getDep().getDep_id());
//		dep.delStudent(student);
//		dep.addStudent(student);
//
//		currentSession.update(student);
//
//	}

//	@Override
//	@Transactional
//	public void alterEmployee(Employee employee) {
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		currentSession.update(employee);
//
//	}

	@Override
	@Transactional
	public Admin getAdmin(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Admin.class, id);
	}

//	@Override
//	@Transactional
//	public Student getStudent(String am) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		return currentSession.bySimpleNaturalId(Student.class).load(am);
//	}

//	@Override
//	@Transactional
//	public Employee getEmployee(int id) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		return currentSession.get(Employee.class, id);
//	}

}
