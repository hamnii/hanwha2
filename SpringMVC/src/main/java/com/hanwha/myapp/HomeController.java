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
		System.out.println("redirect test입니다.");
		return "redirect:han";
	}
	@RequestMapping("/redirecttest2")
	public String redirecttest2() {
		System.out.println("redirect test입니다.");
		return "test3";
	}
	
	
	@RequestMapping(value = "/paramtest2")
	public ModelAndView paramtest2(UserDTO user) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("userid",user.getUserid());
		mv.addObject("username",user.getUsername()+"a");
		mv.setViewName("paramtestResult");
		return mv;	//요청은 test로 하고 실제로 유저에게 보내주는 건 test3 - > 이건 접두사 접미사 붙여서 test3.jsp 되어서 유저에게 날라감. -> 그럼 test3만들어야하는데 그건 반드시 views밑에 있어야한다.
	}
	
	
	
	@RequestMapping(value = "/paramtest")
	public ModelAndView paramtest(Integer userid,String username) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("userid",userid+100);
		mv.addObject("username",username+"a");
		mv.setViewName("paramtestResult");
		return mv;	//요청은 test로 하고 실제로 유저에게 보내주는 건 test3 - > 이건 접두사 접미사 붙여서 test3.jsp 되어서 유저에게 날라감. -> 그럼 test3만들어야하는데 그건 반드시 views밑에 있어야한다.
	}
	
	
	@RequestMapping(value = "/han")
	public ModelAndView han() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("company","한화ICT****");
		mv.addObject("dept", "개발부****");
		mv.addObject("myname", "율무덕후혜민****");
		mv.setViewName("test3");
		
		return mv;	//요청은 test로 하고 실제로 유저에게 보내주는 건 test3 - > 이건 접두사 접미사 붙여서 test3.jsp 되어서 유저에게 날라감. -> 그럼 test3만들어야하는데 그건 반드시 views밑에 있어야한다.
	}
	
	
	@RequestMapping(value = "/test")
	public String test2(Model model) {
		model.addAttribute("company","한화ICT");
		model.addAttribute("dept", "개발부");
		model.addAttribute("myname", "혜민");
		
		return "test3";	//요청은 test로 하고 실제로 유저에게 보내주는 건 test3 - > 이건 접두사 접미사 붙여서 test3.jsp 되어서 유저에게 날라감. -> 그럼 test3만들어야하는데 그건 반드시 views밑에 있어야한다.
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
