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
		return session.selectList("com.hanwha.hospital.selectall");
//deptMapper���� �ִ� namespace���� id���� �� select���� ����
	}

	public List<String> selectAllEtc() {
		return session.selectList("com.hanwha.hospital.selectalletc");

	}

	public List<HospitalDTO> selectByAddress(String addr) {

		return session.selectList("com.hanwha.hospital.selectbyaddress", addr);
	}

}
