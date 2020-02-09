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
import gr.hua.dit.service.AdminService;
import gr.hua.dit.service.EmployeeService;
import gr.hua.dit.service.StudentService;

@Controller
@RequestMapping("/admin")
public class AdminContoller {

	@Autowired
	private AdminService adminService;
	private StudentService studentService;
	private EmployeeService employeeService;
//	@RequestMapping("/addAdmin")
//	public String addAdmin(HttpServletRequest request, Model model) {
//
//		Admin admin = new Admin();
//		admin.setAm(request.getParameter("am"));
//		admin.setFirst_name(request.getParameter("first_name"));
//		admin.setLast_name(request.getParameter("last_name"));
//		admin.setEmail(request.getParameter("email"));
//		admin.setRole(request.getParameter("role"));
//
//		adminService.
//
//		return "done";
//	}

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
		adminService.addStudent(student);

		return "done";
	}

//	@RequestMapping("/addEmployee")
//	public String addEmployee(HttpServletRequest request, Model model) {
//
//		Employee employee = new Employee();
//		employee.setAm(request.getParameter("am"));
//		employee.setFirst_name(request.getParameter("first_name"));
//		employee.setLast_name(request.getParameter("last_name"));
//		employee.setEmail(request.getParameter("email"));
//		employee.setRole(request.getParameter("role"));
//		employee.setIs_supervisor((Integer.parseInt(request.getParameter("is_supervisor"))) != 0);
//		Departement dep = new Departement();
//		//dep.setDep_name(request.getParameter("dep_name"));
//		dep.setDep_id(Integer.parseInt(request.getParameter("dep_name")));
//		employee.setDepartement(dep);
//		employeeService.addEmployee(employee);
//
//		return "done";
//	}

	@RequestMapping("/delStudent")
	public String delStudent(HttpServletRequest request, Model model) {

		adminService.deleteStudent(adminService.getStudent(request.getParameter("am")));

		return "done";
	}

//	@RequestMapping("/delEmployee")
//	public String delEmployee(HttpServletRequest request, Model model) {
//
//		adminDAO.deleteEmployee(adminDAO.getEmployee(Integer.parseInt(request.getParameter("id"))));
//
//		return "done";
//	}

//	@RequestMapping("/alterStudent")
//	public String alterStudent(HttpServletRequest request, Model model) {
//
//		Student student = adminDAO.getStudent(request.getParameter("am"));
//		
//		student.setAm(request.getParameter("am"));
//		student.setFirst_name(request.getParameter("first_name"));
//		student.setLast_name(request.getParameter("last_name"));
//		student.setEmail(request.getParameter("email"));
//		student.setRole(request.getParameter("role"));
//		student.setDate_of_birth(request.getParameter("date_of_birth"));
//		student.setYear_of_enrollment(Integer.parseInt(request.getParameter("year_of_enrollment")));
//		Departement dep = new Departement();
//		dep.setDep_id(Integer.parseInt(request.getParameter("dep_name")));
//		student.setDep(dep);
//		
//		
//		adminDAO.alterStudent(student);
//
//		return "done";
//	}

	@RequestMapping("/getStudent")
	public String getStudent(HttpServletRequest request, Model model) {

		Student student = adminService.getStudent(request.getParameter("am"));

		request.setAttribute("am", student.getAm());
		request.setAttribute("first_name", student.getFirst_name());
		request.setAttribute("last_name", student.getLast_name());
		request.setAttribute("email", student.getEmail());
		request.setAttribute("date_of_birth", student.getDate_of_birth());
		request.setAttribute("year_of_enrollment", student.getYear_of_enrollment());
		request.setAttribute("dep_name", student.getDep().getDep_name());

		return "student";
	}

}
