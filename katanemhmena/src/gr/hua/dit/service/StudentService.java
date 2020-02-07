package gr.hua.dit.service;

import gr.hua.dit.entity.Form;
import gr.hua.dit.entity.Student;

public interface StudentService {

	public Student getSelf(int id);

	public void makeForm(Form form);

	public Form seeForm(int id);

}
