package com.hanwha.mypjt;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HospitalDAO_Mybatis {
	@Autowired
	SqlSession session;
	
	
	public List<HospitalDTO> selectAll() { 
		return session.selectList("com.hanwha.mypjt.selectall");

	
		//deptMapper가면 있는 namespace쓰고 id쓰고 그 select문장 실행
	}
	
}
