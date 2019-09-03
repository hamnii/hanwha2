package com.hanwha.mypjt;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO_Mybatis {

	@Autowired
	SqlSession session;
	
	public List<BoardDTO> selectAll(){
		return session.selectList("com.hanwha.board.selectall");
	}
	public int insertBoard(BoardDTO board) {
		return session.insert("com.hanwha.board.insert", board);
	}
	
	
}