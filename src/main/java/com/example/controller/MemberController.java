package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.MemberDto;
import com.example.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class MemberController {
	@Autowired
	private MemberService service;
	
	@PostMapping("/getId")
	public String getId(MemberDto dto) {
		log.info("MemberController getId()");
		boolean b = service.getId(dto);
		if(b) {
			return "no";
		}
		return "ok";
	}
	
	@PostMapping("/addMember")
	public String addMember(MemberDto dto) {
		log.info("MemberController addmember()");
		
		boolean b = service.addMember(dto);
		log.info(dto.toString());
		if(b) {
			return "ok";
		}
		return "no";
	}
	
	@PostMapping("/login")
	public MemberDto login(MemberDto dto) {
		log.info("MemberController login()");
		return service.login(dto);
	}
}
