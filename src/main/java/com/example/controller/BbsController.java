package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.BbsDto;
import com.example.service.BbsService;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin("*")
public class BbsController {
	@Autowired
	private BbsService s;
	
	@GetMapping("/getBbsList")
	public List<BbsDto> getBbsList(HttpServletRequest request) {
		return s.getBbsList();
	}
	
	@GetMapping("/getBbsListSearch")
	public List<BbsDto> getBbsListSearch(@RequestParam("title")String title) {
		return s.getBbsListSearch(title);
	}
}
	
	