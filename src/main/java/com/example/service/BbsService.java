package com.example.service;

import java.util.List;

import com.example.DTO.BbsDto;

public interface BbsService {
	public List<BbsDto> getBbsList();
	public List<BbsDto> getBbsListSearch(String title);
}
