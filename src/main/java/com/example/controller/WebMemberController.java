package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class WebMemberController {
	
	@GetMapping("/index")
	public String index(Model m) {
		return "index";
	}
	
	@GetMapping("/account")
	public String account(Model m) {
		return "account";
	}
	
	@GetMapping("/loginform")
	public String login(Model m) {
		return "login";
	}
	
	
}
