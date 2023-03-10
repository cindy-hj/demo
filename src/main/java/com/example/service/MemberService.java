package com.example.service;

import com.example.DTO.MemberDto;

public interface MemberService {
	public boolean getId(MemberDto dto);
	public boolean addMember(MemberDto dto);
	public MemberDto login(MemberDto dto);
}
