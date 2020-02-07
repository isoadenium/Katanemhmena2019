package gr.hua.dit.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import gr.hua.dit.dao.DepartementDAO;
import gr.hua.dit.dao.EmployeeDAO;
import gr.hua.dit.dao.StudentDAO;
import gr.hua.dit.entity.Departement;
import gr.hua.dit.entity.Employee;
import gr.hua.dit.entity.Student;

@Service
public class AdminServiceImpl implements AdminService {

	private DepartementDAO departementDAO;
	private StudentDAO studentDAO;
	private EmployeeDAO employeeDAO;

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

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee.getEmp_id());

	}

	@Override
	@Transactional
	public void deleteStudent(Student student) {

		Departement dep = departementDAO.getDepartement(student.getDep().getDep_id());
		dep.delStudent(student);

		studentDAO.deleteStudent(student.getStudent_id());

	}
	
}
