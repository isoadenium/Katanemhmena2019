package gr.hua.dit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;

//	@Override
//	@Transactional
//	public void makeForm(Form form) {
//
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		currentSession.save(form);
//	}

	@Override
	public Student getStudent(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Student.class, id);
	}

	@Override

	public Student getStudentByName(String first_name) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.bySimpleNaturalId(Student.class).load(first_name);
	}

	@Override
	public void saveStudent(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		Student student = currentSession.get(Student.class, id);

		currentSession.delete(student);
	}

	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Student> query = currentSession.createQuery("from student order by lastName", Student.class);

		List<Student> students = query.getResultList();

		return students;
	}

}
