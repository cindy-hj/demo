package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.DTO.BbsDto;

@Mapper
@Repository
public interface BbsMapper {
	public List<BbsDto> getBbsList();
	public List<BbsDto> getBbsListSearch(String title);
}
