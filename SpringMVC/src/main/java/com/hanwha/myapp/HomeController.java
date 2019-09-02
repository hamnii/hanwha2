package com.hanwha.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/redirecttest")
	public String redirecttest() {
		System.out.println("redirect test�Դϴ�.");
		return "redirect:han";
	}
	@RequestMapping("/redirecttest2")
	public String redirecttest2() {
		System.out.println("redirect test�Դϴ�.");
		return "test3";
	}
	
	
	@RequestMapping(value = "/paramtest2")
	public ModelAndView paramtest2(UserDTO user) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("userid",user.getUserid());
		mv.addObject("username",user.getUsername()+"a");
		mv.setViewName("paramtestResult");
		return mv;	//��û�� test�� �ϰ� ������ �������� �����ִ� �� test3 - > �̰� ���λ� ���̻� �ٿ��� test3.jsp �Ǿ �������� ����. -> �׷� test3�������ϴµ� �װ� �ݵ�� views�ؿ� �־���Ѵ�.
	}
	
	
	
	@RequestMapping(value = "/paramtest")
	public ModelAndView paramtest(Integer userid,String username) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("userid",userid+100);
		mv.addObject("username",username+"a");
		mv.setViewName("paramtestResult");
		return mv;	//��û�� test�� �ϰ� ������ �������� �����ִ� �� test3 - > �̰� ���λ� ���̻� �ٿ��� test3.jsp �Ǿ �������� ����. -> �׷� test3�������ϴµ� �װ� �ݵ�� views�ؿ� �־���Ѵ�.
	}
	
	
	@RequestMapping(value = "/han")
	public ModelAndView han() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("company","��ȭICT****");
		mv.addObject("dept", "���ߺ�****");
		mv.addObject("myname", "������������****");
		mv.setViewName("test3");
		
		return mv;	//��û�� test�� �ϰ� ������ �������� �����ִ� �� test3 - > �̰� ���λ� ���̻� �ٿ��� test3.jsp �Ǿ �������� ����. -> �׷� test3�������ϴµ� �װ� �ݵ�� views�ؿ� �־���Ѵ�.
	}
	
	
	@RequestMapping(value = "/test")
	public String test2(Model model) {
		model.addAttribute("company","��ȭICT");
		model.addAttribute("dept", "���ߺ�");
		model.addAttribute("myname", "����");
		
		return "test3";	//��û�� test�� �ϰ� ������ �������� �����ִ� �� test3 - > �̰� ���λ� ���̻� �ٿ��� test3.jsp �Ǿ �������� ����. -> �׷� test3�������ϴµ� �װ� �ݵ�� views�ؿ� �־���Ѵ�.
	}
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
