package com.hanwha.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpService {
	
	@Autowired
	//EmpDAO dao;
	EmpDAO_Mybatis dao;
	
	public List<String> selectAllJob() {
		return dao.selectAllJob();
	}
	
	public List<Integer> selectAllManager() {
		
		return dao.selectAllManager();
	}
	/*
	//6.job으로 직원 조회
		public List<EmpVO> selectByJob(String job, int sal) {
			return dao.selectByJob(job, sal);
		}
	
	//5.특정 부서의 직원 조회
	public List<EmpVO> selectByDept(int deptid) {
		return dao.selectByDept(deptid);
	}
	*/
	
	//2. 직원 전부 조회
	public List<EmpVO> selectAll() {
		return dao.selectAll();
	}

	//4.특정 직원 조회
	public EmpVO selectById(int empid) {
		return dao.selectById(empid);
	}
	
	// 10.직원입력
		public int insertEmp(EmpVO emp) {
			return dao.insertEmp(emp);
		}

	//11.직원수정
		public int updateEmp(EmpVO emp) { 
			return dao.updateEmp(emp);
		 }
		
	//12.직원삭제
	public int deleteEmp(int emp) {	//부서 코드만 받을 것이기 때문에
		return dao.deleteEmp(emp);
}
}
