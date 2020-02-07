package gr.hua.dit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showfirstpage() {
		return "index";
	}

	@RequestMapping("/showAddAdminForm")
	public String showAddAdminForm() {
		return "addAdminForm";
	}

	@RequestMapping("/showAddStudentForm")
	public String showAddStudentForm() {
		return "addStudentForm";
	}

	@RequestMapping("/showAddEmployeeForm")
	public String showAddEmployeeForm() {
		return "addEmployeeForm";
	}

	@RequestMapping("/showDelEmployee")
	public String showDelEmployee() {
		return "delEmployee";
	}

	@RequestMapping("/showDelStudent")
	public String showDelStudent() {
		return "delStudent";
	}

	@RequestMapping("/showMakeFormForm")
	public String showMakeFormForm() {
		return "makeFormForm";
	}
	
	@RequestMapping("/showGiveStudentAm")
	public String showGiveStudentAm() {
		return "giveStudentAm";
	}
	
}
/*
 * @RequestMapping("/processForm") public String processForm() { return
 * "helloworld"; }
 * 
 * @RequestMapping("/processFormv2") public String
 * processFormv2(HttpServletRequest request, Model model) { String theName =
 * request.getParameter("studentName"); theName = theName.toUpperCase(); String
 * result ="Hello " + theName; model.addAttribute("message",result); return
 * "helloworld"; }
 */