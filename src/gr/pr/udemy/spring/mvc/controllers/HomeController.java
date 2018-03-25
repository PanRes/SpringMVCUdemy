package gr.pr.udemy.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("showForm")
	public String showForm() {
		return "helloWorld-Form";
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		model.addAttribute("message","Yo! " + theName);
		
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		
		model.addAttribute("message","Hey my Friend " + theName.toUpperCase());
		
		return "helloWorld";
	}
	
}
