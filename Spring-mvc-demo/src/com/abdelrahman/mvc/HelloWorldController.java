package com.abdelrahman.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "handleShowForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(/*@RequestParam("visitorName") String Name,*/HttpServletRequest req , Model model) {
		
		///
		String Name =  req.getParameter("visitorName");
		model.addAttribute("UppeRvisitorName", Name.toUpperCase());
		return "handleProcessForm";
	}
	
}
