package com.hanwha.mypjt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	HospitalDAO_Mybatis dao;
	
	@RequestMapping("/home")
	public String main() {
		return "home";
	}
	
	
	@RequestMapping("/list")
	public ModelAndView hospitalList() {
		ModelAndView mv= new ModelAndView();
		List<HospitalDTO> list= dao.selectAll();
		System.out.println(list);
		mv.addObject("hospitallist", list);
		mv.setViewName("hospitallist");
		return mv;
	}
	
}
