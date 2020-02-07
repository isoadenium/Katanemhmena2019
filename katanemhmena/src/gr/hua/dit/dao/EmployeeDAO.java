package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Employee;


public interface EmployeeDAO {
	public List<Employee> getEmployees();

	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	public Employee getEmployee(int id);

}
