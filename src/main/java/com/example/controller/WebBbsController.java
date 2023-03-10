package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WebBbsController {
	@GetMapping("/getBbsList")
	public String getBbsList(Model m) {
		return "getBbsList";
	}
	
	@GetMapping("/getBbsListSearch")
	public String getBbsListSearch(Model m) {
		return "getBbsListSearch";
	}
}
