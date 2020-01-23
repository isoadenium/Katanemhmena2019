package gr.hua.dit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.dao.AdminDAO;
import gr.hua.dit.entity.Admin;
import gr.hua.dit.entity.Departement;
import gr.hua.dit.entity.Employee;
import gr.hua.dit.entity.Student;

@Controller
@RequestMapping("/admin")
public class AdminContoller {

	@Autowired
	private AdminDAO adminDAO;

	@RequestMapping("/addAdmin")
	public String addAdmin(HttpServletRequest request, Model model) {

		Admin admin = new Admin();
		admin.setAm(request.getParameter("am"));
		admin.setFirst_name(request.getParameter("first_name"));
		admin.setLast_name(request.getParameter("last_name"));
		admin.setEmail(request.getParameter("email"));
		admin.setRole(request.getParameter("role"));

		adminDAO.addAdmin(admin);

		return "done";
	}

	@RequestMapping("/addStudent")
	public String addStudent(HttpServletRequest request, Model model) {

		Student student = new Student();
		student.setAm(request.getParameter("am"));
		student.setFirst_name(request.getParameter("first_name"));
		student.setLast_name(request.getParameter("last_name"));
		student.setEmail(request.getParameter("email"));
		student.setRole(request.getParameter("role"));
		student.setDate_of_birth(request.getParameter("date_of_birth"));
		student.setYear_of_enrollment(Integer.parseInt(request.getParameter("year_of_enrollment")));
		Departement dep = new Departement();
		dep.setDep_id(Integer.parseInt(request.getParameter("dep_name")));
		student.setDep(dep);
		adminDAO.addStudent(student);

		return "done";
	}

	@RequestMapping("/addEmployee")
	public String addEmployee(HttpServletRequest request, Model model) {

		Employee employee = new Employee();
		employee.setAm(request.getParameter("am"));
		employee.setFirst_name(request.getParameter("first_name"));
		employee.setLast_name(request.getParameter("last_name"));
		employee.setEmail(request.getParameter("email"));
		employee.setRole(request.getParameter("role"));
		employee.setIs_supervisor((Integer.parseInt(request.getParameter("is_supervisor"))) != 0);
		Departement dep = new Departement();
		dep.setDep_name(request.getParameter("dep_name"));
		employee.setDepartement(dep);
		adminDAO.addEmployee(employee);

		return "done";
	}

	@RequestMapping("/delStudent")
	public String delStudent(HttpServletRequest request, Model model) {

		adminDAO.deleteStudent(adminDAO.getStudent(Integer.parseInt(request.getParameter("id"))));

		return "done";
	}

	@RequestMapping("/delEmployee")
	public String delEmployee(HttpServletRequest request, Model model) {

		adminDAO.deleteEmployee(adminDAO.getEmployee(Integer.parseInt(request.getParameter("id"))));

		return "done";
	}
}
