package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.dtos.HosDto;


@Mapper
public interface HosMapper {

	// 글 목록
	public List<HosDto> getAllList();
	
	// 검색관련 목록
	public List<HosDto> getSelectList(String type);
	
}
