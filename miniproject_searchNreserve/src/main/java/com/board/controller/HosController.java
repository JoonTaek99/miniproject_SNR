package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.dtos.HosDto;
import com.board.service.HosService;

@Controller
@RequestMapping(value = "/hos")
public class HosController {

	@Autowired
	private HosService hosService;
	
	@GetMapping(value = "/boardList")
	public String boardList(Model model) {
		System.out.println("병원목록 보기");
		List<HosDto> list = hosService.getAllList();
		model.addAttribute("list", list);
		
		return "hos/hosList";
	}
	
	@GetMapping(value = "/selectList")
	public String SelectList(Model model, String type) {
		System.out.println("검색목록 보기");
		List<HosDto> list = hosService.getSelectList(type);
		model.addAttribute("list", list);
		return "hos/hosList";
	}
}







