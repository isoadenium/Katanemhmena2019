package gr.hua.dit.service;

import gr.hua.dit.entity.Employee;
import gr.hua.dit.entity.Student;

public interface AdminService {

	void addStudent(Student student);

	void addEmployee(Employee employee);

	void deleteStudent(Student student);

	void deleteEmployee(Employee employee);

}
