package gr.hua.dit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.dao.StudentDAO;
import gr.hua.dit.entity.Form;
import gr.hua.dit.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentDAO studentDAO;

	@RequestMapping("/makeForm")
	public String makeForm(HttpServletRequest request, Model model) {

		Form form = new Form();

		form.setBro_sis(Integer.parseInt(request.getParameter("bro_sis")));
		form.setFamilly_income(Integer.parseInt(request.getParameter("familly_income")));
		form.setIncome(Integer.parseInt(request.getParameter("income")));
		form.setUnemp_parents(Integer.parseInt(request.getParameter("unemp_parents")));

		Student student = new Student();
		student.setStudent_id(Integer.parseInt(request.getParameter("student_id")));

		form.setStudent(student);
		studentDAO.makeForm(form);

		return "done";
	}

}
