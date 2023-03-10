package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.MemberDto;
import com.example.mapper.MemberMapper;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	private MemberMapper mm;
	@Override
	public boolean getId(MemberDto dto) {
		int n = mm.getId(dto);
		return n>0;
	}

	@Override
	public boolean addMember(MemberDto dto) {
		int n = mm.addMember(dto);
		return n>0;
	}

	@Override
	public MemberDto login(MemberDto dto) {
		
		return mm.login(dto);
	}

}
