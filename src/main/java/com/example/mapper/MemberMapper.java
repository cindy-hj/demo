package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.DTO.MemberDto;

@Mapper
@Repository
public interface MemberMapper {
	public int getId(MemberDto dto);
	public int addMember(MemberDto dto);
	public MemberDto login(MemberDto dto);
}
