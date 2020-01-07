package gr.hua.dit.dao;

import gr.hua.dit.entity.Admin;
import gr.hua.dit.entity.Employee;
import gr.hua.dit.entity.Student;

public interface AdminDAO {

	public void addAdmin(Admin admin);

	public void addStudent(Student student);

	public void addEmployee(Employee employee);

	public void deleteAdmin(Admin admin);

	public void deleteStudent(Student student);

	public void deleteEmployee(Employee employee);

	public void alterAdmin(Admin admin);

	public void alterStudent(Student student);

	public void alterEmployee(Employee employee);

	public Admin getAdmin(int id);

	public Student getStudent(int id);

	public Employee getEmployee(int id);

}
