package com.example.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BbsDto {
	private int seq;
	private String id;
	private int ref;
	private int step;
	private int depth;
	
	private String title;
	private String content;
	private String wdate; // 작성일
	
	private int del;
	private int readCount;
}
