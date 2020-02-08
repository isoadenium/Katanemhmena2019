package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Student;

public interface StudentDAO {

	//public void makeForm(Form form);
	
	public Student getStudent(int id);
	
	public void saveStudent(Student student);

	public void deleteStudent(int id);
	
	public List<Student> getStudents();

	Student getStudentByName(String am);
}
