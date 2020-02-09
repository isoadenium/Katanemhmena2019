package gr.hua.dit.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.dao.FormDAO;
import gr.hua.dit.dao.PointsDAO;
import gr.hua.dit.dao.StudentDAO;
import gr.hua.dit.entity.Form;
import gr.hua.dit.entity.Points;
import gr.hua.dit.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private FormDAO formDAO;
	@Autowired
	private PointsDAO pointsDAO;

	@Override
	@Transactional
	public Student getSelf(int id) {
		return studentDAO.getStudent(id);
	}

	@Override
	@Transactional
	public Student getSelfByName(String am) {
		return studentDAO.getStudentByName(am);
	}

	@Override
	@Transactional
	public void makeForm(Form form) {
		formDAO.saveForm(form);
	}

	@Override
	@Transactional
	public Form seeForm(int id) {
		return formDAO.getForm(id);
	}

	@Override
	@Transactional
	public Points seePoints(int id) {
		return pointsDAO.getPoints(id);
	}

}
