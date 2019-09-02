package com.hanwha.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hanwha.model.DeptDAO_Mybatis;
import com.hanwha.model.DeptDTO;
import com.hanwha.model.EmpService;
import com.hanwha.model.EmpVO;

//�� ��Ʈ�ѷ���!!!!!!!!!!
//DeptDAO dao=new DeptDAO();
//<bean id="dao" class="com.hanwha.model.deptDAO"/>
//<bean id="mycontroller" class="">
@Controller	
public class MyController {
	
	
	@Autowired
	DeptDAO_Mybatis dao;
	
	//@Autowired
	//DeptDAO dao;
	
	@Autowired
	EmpService service;
	//EmpDAO_Mybatis service;s
	
	@RequestMapping("/emp/emplist")
	public ModelAndView selectAll() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("emplist", service.selectAll());
		mv.setViewName("emp/empAll");
		return mv;
	}
	
	@RequestMapping(value="/emp/empdetail",method=RequestMethod.GET)	//detail �� �󼼺��⵵ �ְ� ������ �����ϱ� �󼼺���� get ������ post
	public ModelAndView selectDetail(int empid) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("emp",service.selectById(empid));
		mv.addObject("managerlist",service.selectAllManager());
		mv.addObject("joblist",service.selectAllJob());
		mv.addObject("deptlist",dao.selectAll());
		mv.setViewName("emp/empdetail");
		return mv;
	}
	@RequestMapping(value="/emp/empdetail",method=RequestMethod.POST)	//detail �� �󼼺��⵵ �ְ� ������ �����ϱ� �󼼺���� get ������ post
	public String updateDetail(EmpVO emp) {
		 service.updateEmp(emp);
		return "redirect:emplist";
	}
	

	@RequestMapping(value="/emp/empdelete",method=RequestMethod.GET)
	public String empDelete(int empid) {
		
		
		service.deleteEmp(empid);
		
		return "redirect:emplist";
	}
	
	
	@RequestMapping(value="/emp/empinsert",method=RequestMethod.GET)
	public ModelAndView empInsert() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("deptlist", dao.selectAll());
		mv.addObject("joblist", service.selectAllJob());
		mv.addObject("managerlist", service.selectAllManager());
		mv.setViewName("emp/empinsert");
		return mv;
	}
	
	@RequestMapping(value="/emp/empinsert",method=RequestMethod.POST)
	public String empInsertPost(EmpVO emp) {

		 service.insertEmp(emp);
	
		return "redirect:emplist";
		
	}
	
	@RequestMapping("/404")
	public String  error404(Model model) {
		model.addAttribute("company","��ȭICT");
		model.addAttribute("manager","������");
		return "error404";
		
	}
	
	/*
	@RequestMapping("/500")
	public String  error500(Model model) {
		model.addAttribute("company","��ȭICT");
		model.addAttribute("manager","������");
		model.addAttribute("phone","010-1234-5678");
		return "error500";
		
	}
	*/
	@ExceptionHandler(Exception.class)
	public String error500(Exception ex, Model model) {
		model.addAttribute("company","��ȭICT");
		model.addAttribute("manager","������");
		model.addAttribute("phone","010-1234-5678");
		model.addAttribute("errormessage", ex.getMessage());
		return "error500";
	}
	
	
	@RequestMapping("/dept/deptlist")
	public String deptlist3(Model model) {
		model.addAttribute("deptlist",dao.selectAll());
		return "dept/deptlist";	//�������� �̸� . �� �����ٰ��� 
	}
	
	@RequestMapping(value="/dept/deptdetail",method=RequestMethod.GET)
	public String detail(int deptid,Model model) {
		model.addAttribute("dept", dao.selectById(deptid));
		return "dept/deptdetail";
	}
	

	@RequestMapping(value="/dept/deptdetail",method=RequestMethod.POST)
	public String deptDetailPost(DeptDTO dept) {
		dao.updateDept(dept);
		return "redirect:deptlist";
	}
	
	
	@RequestMapping(value="/dept/deptinsert",method=RequestMethod.GET)
	public String  detailInsert() {
		return "dept/deptinsert";
	}
	
	@RequestMapping(value="/dept/deptinsert",method=RequestMethod.POST)
	 public String deptInsertPost(DeptDTO dept,HttpServletRequest request) {	//frontController�� request�� �� 
	 MultipartFile uploadfile =dept.getUploadfile();
	 if (uploadfile == null) {
		 return "redirect:deptinsert";
		 
	 }
	 String path = request.getSession().getServletContext().getRealPath("/resources");
	 System.out.println("�������� ���� ���:" + path);
	 String fileName = uploadfile.getOriginalFilename();
	 String fpath = path +"\\" + fileName ;	//full Path
	 dept.setFileName(fileName); //������ ��� ����
	 try {
	 // ���1) FileOutputStream ���
	 // byte[] fileData = file.getBytes();
	 // FileOutputStream output = new FileOutputStream(fpath);
	 // output.write(fileData);
	 // 2. File ���(�̰� �� ����)
	 File file = new File(fpath);
	 uploadfile.transferTo(file);	//���ε� ���� �� file�� transfer�� 
	 } catch (IOException e) { e.printStackTrace(); }
	 
	 dao.insertDept(dept);
	 return "redirect:deptlist";
	 
	 } 
	//
	@RequestMapping("/dept/deptdownload")
	public void download(String folder, String file,HttpServletRequest request,HttpServletResponse response) throws IOException {
		 response.setHeader("Content-Disposition", "attachment;filename="+file);
		 String fullPath = request.getSession().getServletContext().getRealPath( folder + "/" + file );
		 FileInputStream fi = new FileInputStream(fullPath);
		 ServletOutputStream sout = response.getOutputStream();
		 byte[] buf = new byte[1024];
		 int size = 0;
		 while((size = fi.read(buf, 0, 1024))!=-1){
		 sout.write(buf, 0, size);
		 }
		 fi.close();
		 sout.close();
		
	}
	
	@RequestMapping(value="/dept/deptdelete",method=RequestMethod.GET)
	public String detailDelete(int deptid) {
		dao.deleteDept(deptid);
		return "redirect:deptlist";
	}
	

}
