package gr.hua.dit.dao;

import gr.hua.dit.entity.Admin;

public interface AdminDAO {

	public void addAdmin(Admin admin);

	// public void addStudent(Student student);

	// public void addEmployee(Employee employee);

	public void deleteAdmin(int id);

	// public void deleteStudent(Student student);

	// public void deleteEmployee(Employee employee);

	public void alterAdmin(Admin admin);

	// public void alterStudent(Student student);

	// public void alterEmployee(Employee employee);

	public Admin getAdmin(int id);

	// public Student getStudent(String id);

	// public Employee getEmployee(int id);

}
