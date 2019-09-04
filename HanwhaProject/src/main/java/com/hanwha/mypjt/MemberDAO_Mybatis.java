package com.hanwha.mypjt;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO_Mybatis {
	
	@Autowired
	SqlSession session;
	
	public int insertMember(MemberDTO member) {
		return session.insert("com.hanwha.member.insert", member);
	}

	public MemberDTO loginChk(MemberDTO member) {
		// TODO Auto-generated method stub
		return session.selectOne("com.hanwha.member.login",member);
	}

//	public String dupMember(String member_id) {
//		return session.selectOne("com.hanwha.member.dup", member_id);
//	}

	public MemberDTO dupMember(String member_id) { 
		return session.selectOne("com.hanwha.member.dup", member_id);
		
	}

}
