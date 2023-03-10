package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.BbsDto;
import com.example.mapper.BbsMapper;

@Service
public class BbsServiceImp implements BbsService {

	@Autowired
	private BbsMapper bm;

	@Override
	public List<BbsDto> getBbsList() {
		return bm.getBbsList();
	}

	@Override
	public List<BbsDto> getBbsListSearch(String title) {
		return bm.getBbsListSearch(title);
	}
	
}
