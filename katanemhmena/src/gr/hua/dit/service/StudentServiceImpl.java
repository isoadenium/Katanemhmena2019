package gr.hua.dit.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.dao.FormDAO;
import gr.hua.dit.dao.StudentDAO;
import gr.hua.dit.entity.Form;
import gr.hua.dit.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	private FormDAO formDAO;

	@Override
	@Transactional
	public Student getSelf(int id) {
		return studentDAO.getStudent(id);
	}

	@Override
	public void makeForm(Form form) {
		formDAO.saveForm(form);
	}

	@Override
	public Form seeForm(int id) {
		return formDAO.getForm(id);
	}

}
