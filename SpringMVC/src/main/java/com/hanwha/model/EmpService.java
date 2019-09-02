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
	//6.job���� ���� ��ȸ
		public List<EmpVO> selectByJob(String job, int sal) {
			return dao.selectByJob(job, sal);
		}
	
	//5.Ư�� �μ��� ���� ��ȸ
	public List<EmpVO> selectByDept(int deptid) {
		return dao.selectByDept(deptid);
	}
	*/
	
	//2. ���� ���� ��ȸ
	public List<EmpVO> selectAll() {
		return dao.selectAll();
	}

	//4.Ư�� ���� ��ȸ
	public EmpVO selectById(int empid) {
		return dao.selectById(empid);
	}
	
	// 10.�����Է�
		public int insertEmp(EmpVO emp) {
			return dao.insertEmp(emp);
		}

	//11.��������
		public int updateEmp(EmpVO emp) { 
			return dao.updateEmp(emp);
		 }
		
	//12.��������
	public int deleteEmp(int emp) {	//�μ� �ڵ常 ���� ���̱� ������
		return dao.deleteEmp(emp);
}
}
