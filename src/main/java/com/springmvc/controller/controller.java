package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class controller 
{
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String dohyoen(Model model)
	{
		model.addAttribute("hy", "안녕하세요");
		model.addAttribute("dohyeon", "저는 도현입니다.");
		return "home";
	}
}
