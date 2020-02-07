package gr.hua.dit.service;

import javax.transaction.Transactional;

import org.hibernate.Session;

import gr.hua.dit.dao.DepartementDAO;
import gr.hua.dit.dao.StudentDAO;
import gr.hua.dit.entity.Departement;
import gr.hua.dit.entity.Student;

public class AdminServiceImpl implements AdminService {
	
	private DepartementDAO departementDAO;
	private StudentDAO studentDAO;
	@Override
	@Transactional
	public void addStudent(Student student) {
		

		// session.beginTransaction();

		Departement dep = departementDAO.getDepartement(student.getDep().getDep_id());

		dep.addStudent(student);

		studentDAO.saveStudent(student);

		// session.getTransaction().commit();

		// System.out.println("Done!");

	}
}
