package gr.hua.dit.service;

import java.util.List;

import gr.hua.dit.entity.Employee;
import gr.hua.dit.entity.Points;
import gr.hua.dit.entity.Student;

public interface EmployeeService {
	
	public List<Student> getStudents();
	
	public Student getStudent(int id);
	
	public Employee seeSelf(int id);
	
	public void delStudent(int id);

	Points seePoints(int id);
	
	

}
