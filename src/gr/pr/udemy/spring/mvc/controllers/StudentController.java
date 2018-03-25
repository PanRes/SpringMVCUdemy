package gr.pr.udemy.spring.mvc.controllers;

import gr.pr.udemy.spring.mvc.beans.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@Value("#{sexOptions}")
	private Map<String, String> sexOptions;
	
	@Value("#{deviceOptions}")
	private Map<String, String> deviceOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		Student student = new Student();
		
		theModel.addAttribute("student", student);
		theModel.addAttribute("theCountryOption",countryOptions);
		theModel.addAttribute("theSexOptions",sexOptions);
		theModel.addAttribute("theDeviceOptions",deviceOptions);
		
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		
		student.setCountry(countryOptions.get(student.getCountry()));
		
		System.out.println(student);
		
		return "studentConfirmation";
	}
}
