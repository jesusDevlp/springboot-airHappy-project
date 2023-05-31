package com.cibertec.air.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String HomeIndex() {
		return "home";
	}
	
}
