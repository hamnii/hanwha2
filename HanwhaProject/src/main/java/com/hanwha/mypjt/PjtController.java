package com.hanwha.mypjt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class PjtController {
	
	@Autowired
	HospitalDAO_Mybatis dao;
	
	@Autowired
	BoardDAO_Mybatis b_dao;
	
	@RequestMapping("/home")
	public String main() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginController() {
		return "login";
	}
	
	
	@RequestMapping("/list")
	public ModelAndView hospitalList() {
		ModelAndView mv= new ModelAndView();
		List<HospitalDTO> list= dao.selectAll();
		System.out.println(list);
		mv.addObject("etclist", dao.selectAllEtc());
		mv.addObject("hospitallist", list);
		mv.setViewName("hospitallist");
		return mv;
	}
	@RequestMapping("/board")
	public ModelAndView boardList() {
		ModelAndView mv= new ModelAndView();
		List<BoardDTO> list= b_dao.selectAll();
		System.out.println(list);
		mv.addObject("boardlist", list);
		mv.setViewName("freeBoard");
		return mv;
	}
	
	@RequestMapping(value="/boardinsert",method=RequestMethod.GET)
	public String  detailInsert() {
		return "boardinsert";
	}
	
	@RequestMapping(value="/boardinsert",method=RequestMethod.POST)
	public String boardInsertPost(BoardDTO board) {
		b_dao.insertBoard(board);
		
		return "redirect:board";
		
	}
	
}
