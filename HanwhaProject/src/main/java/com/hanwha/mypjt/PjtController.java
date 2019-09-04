package com.hanwha.mypjt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class PjtController {
	
	@Autowired
	HospitalDAO_Mybatis dao;
	
	@Autowired
	BoardDAO_Mybatis b_dao;
	
	@Autowired
	MemberDAO_Mybatis m_dao;

	
	@RequestMapping("/home")
	public String main() {

		return "home";
		
	}
	
	//�α׾ƿ� �� Ȩ���� ������
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:home";
	}
	
	//�α��� Ŭ�� �� �α��� view
	@RequestMapping("/login")
	public String loginGet() {
		return "login";
	}
	
	//�α������� ��, ���̵� �´��� �ȸ´��� Ȯ��
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(MemberDTO member, HttpSession session) {
		MemberDTO member2 = m_dao.loginChk(member);
		if(member2 == null) {
			return "redirect:login";
		}else {
			session.setAttribute("member", member2);
			session.setAttribute("member_id", member2.getMember_id());

			return "redirect:home";
		}
		
	}
	
	//ȸ������ ��ư ������ ȸ������â
	@RequestMapping("/join")
	public String joinController() {
		return "join";
	}
	
	
	@RequestMapping("/list")
	public ModelAndView hospitalList() {
		ModelAndView mv= new ModelAndView();
		List<HospitalDTO> list= dao.selectAll();
		mv.addObject("etclist", dao.selectAllEtc());
		mv.addObject("hospitallist", list);
		mv.setViewName("hospitalsearch");
		return mv;
	}
	
	@RequestMapping("/board")
	public ModelAndView boardList() {
		ModelAndView mv= new ModelAndView();
		List<BoardDTO> list= b_dao.selectAll();
		mv.addObject("boardlist", list);
		mv.setViewName("freeBoard");
		return mv;
	}
	
	//�Խ��� ����� �����ֱ�
	@RequestMapping("/boardthumb")
	public ModelAndView boardthumb() {
		ModelAndView mv= new ModelAndView();
		List<BoardDTO> list= b_dao.selectbythumb();
		mv.addObject("boardlist", list);
		mv.setViewName("boardthumb");
		return mv;
	}
	
	@RequestMapping("/boarddetail")
	public ModelAndView boardDetail(int bno) {
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("board", b_dao.selectbybno(bno));
		mv.setViewName("boardDetail");
		return mv;
	}
	//�Խù������ϱ�
	@RequestMapping(value="boarddelete",method=RequestMethod.GET)
	public String detailDelete(int bno) {
		b_dao.deleteBoard(bno);
		return "redirect:board";
	}
	
	//�Խù������ϱ�
	@RequestMapping(value="boardupdate",method=RequestMethod.POST)
	public String boardupdate(BoardDTO board) {
		b_dao.updateBoard(board);
		return "redirect:boardDetail";
	}
	
	
	
	@RequestMapping(value="/boardinsert",method=RequestMethod.GET)
	public String  detailInsert() {
		return "boardinsert";
	}
	

	
	
	
	@RequestMapping("/hospitalByAddress")
	public String hospitalByAddress(String addr, Model mv) {
		System.out.println(addr);
		List<HospitalDTO> list= dao.selectByAddress(addr);
		mv.addAttribute("hospitallist", list);
		return "hospitallist";
	}
	
	
	@RequestMapping(value="/boardinsert",method=RequestMethod.POST)
	 public String boardInsertPost(BoardDTO board,HttpServletRequest request) {	//frontController�� request�� �� 
	 MultipartFile uploadfile =board.getUploadfile();
	 System.out.println(uploadfile);
	
	 if (uploadfile == null) {
		 return "redirect:boardinsert"; 
	 }
	 String path = request.getSession().getServletContext().getRealPath("/resources");
	 System.out.println("�������� ���� ���:" + path);
	 String fileName = uploadfile.getOriginalFilename();
	 String fpath = path +"\\" + fileName ;	//full Path
	 board.setFileName(fileName); //������ ��� ����
	 try {
	 // ���1) FileOutputStream ���
	 // byte[] fileData = file.getBytes();
	 // FileOutputStream output = new FileOutputStream(fpath);
	 // output.write(fileData);
	 // 2. File ���(�̰� �� ����)
	 File file = new File(fpath);
	 uploadfile.transferTo(file);	//���ε� ���� �� file�� transfer�� 
	 } catch (IOException e) { e.printStackTrace(); }
	 
	 b_dao.insertBoard(board);
	 return "redirect:board";
	 
	 } 
	
	//
	@RequestMapping("/boarddownload")
	public void download(String folder, String file,HttpServletRequest request,HttpServletResponse response) throws IOException {
		 response.setHeader("Content-Disposition", "attachment;filename="+file);
		 String fullPath = request.getSession().getServletContext().getRealPath( folder + "/" + file );
		 System.out.println(folder);			//null�� ����
		 System.out.println(file);
		 System.out.println(fullPath);
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


	@RequestMapping(value="/insertmember",method=RequestMethod.POST)
	public String insertMemberPost(MemberDTO member) {
		int ref=m_dao.insertMember(member);
		System.out.println(ref);
		return "redirect:home";
		
	}
	
	
	/*
	@RequestMapping(value="/memberdupcheck")
	@ResponseBody
	public String memberdupcheck(String member_id) {
		
		//String message = m_dao.dupMember(member_id);
		System.out.println(m_dao.dupMember(member_id));
		return "message";
		
	}
	*/
	
	@RequestMapping(value="/memberdupcheck")
	@ResponseBody
	public String memberdupcheck(String member_id) {
		MemberDTO member2= m_dao.dupMember(member_id);
		if(member2==null) {
		return "0"; }
		else {
			return "1";
					
		}
	}

}
