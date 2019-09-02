package com.hanwha.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanwha.util.DBUtil_Oracle;

@Repository
public class DeptDAO_Mybatis {
	@Autowired
	SqlSession session;
	
	public List<DeptDTO> selectAll() { 
		return session.selectList("com.hanwha.dept.selectall");
	
		//deptMapper가면 있는 namespace쓰고 id쓰고 그 select문장 실행
	}
	public DeptDTO selectById(int deptid) {
		return session.selectOne("com.hanwha.dept.selectbyid", deptid);		//parameter로 받은 deptid를 받아서 메소드 실행해야함.
	}
	
	public int insertDept(DeptDTO dept) {
		return session.insert("com.hanwha.dept.insert", dept);
	}
	
	public int updateDept(DeptDTO dept) {
		return session.update("com.hanwha.dept.update", dept);
	}
	public int deleteDept(int dept) {
		return session.delete("com.hanwha.dept.delete", dept);
	}
	
}
