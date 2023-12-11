package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dtos.HosDto;
import com.board.mapper.HosMapper;

@Service
public class HosService {

	@Autowired
	private HosMapper hosMapper;
	
	//글목록 조회
	public List<HosDto> getAllList(){
		return hosMapper.getAllList();
	}
	
	public List<HosDto> getSelectList(String type){
		return hosMapper.getSelectList(type);
	}
}
