package gr.hua.dit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.entity.Form;
import gr.hua.dit.entity.Student;
import gr.hua.dit.service.StudentService;

@RestController
@RequestMapping("rest/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/makeform", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	public Form makeForm(@RequestParam("bro_sis") String bro_sis, @RequestParam("familly_income") String familly_income,
			@RequestParam("income") String income, @RequestParam("unemp_parents") String unemp_parents) {

		Form form = new Form();

		form.setBro_sis(Integer.parseInt(bro_sis));
		form.setFamilly_income(Integer.parseInt(familly_income));
		form.setIncome(Integer.parseInt(income));
		form.setUnemp_parents(Integer.parseInt(unemp_parents));
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		// student.setStudent_id(Integer.parseInt(request.getParameter("student_id")));
		Student astudent = studentService.getSelfByName(authentication.getName());
		form.setStudent(astudent);
		astudent.setForm(form);
		studentService.makeForm(form);
		return form;
	}

}
