package gr.pr.udemy.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMenuController {
	
	@RequestMapping("/")
	public String showPage() {
		return "mainMenu";
	}
	
}
