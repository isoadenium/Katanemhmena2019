package gr.hua.dit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import gr.hua.dit.dao.EmployeeDAO;
import gr.hua.dit.dao.PointsDAO;
import gr.hua.dit.dao.StudentDAO;
import gr.hua.dit.entity.Employee;
import gr.hua.dit.entity.Points;
import gr.hua.dit.entity.Student;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private StudentDAO studentDAO;
	private EmployeeDAO employeeDAO;
	private PointsDAO pointsDAO;

	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		return studentDAO.getStudent(id);
	}

	@Override
	@Transactional
	public Employee seeSelf(int id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	@Transactional
	public void delStudent(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Points seePoints(int id) {
		return pointsDAO.getPoints(id);
	}

}
