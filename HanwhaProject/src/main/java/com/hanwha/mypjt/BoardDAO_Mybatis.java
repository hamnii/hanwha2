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
	public int deleteBoard(int bno) {
		return session.delete("com.hanwha.board.delete", bno);

	}
	public BoardDTO selectbybno(int bno) {
		// TODO Auto-generated method stub
		return session.selectOne("com.hanwha.board.selectbybno", bno);	
	}

	public List<BoardDTO> selectbythumb() {
		// TODO Auto-generated method stub
		return session.selectList("com.hanwha.board.selectbythumb");
	}
	//게시판 수정하기
	public int updateBoard(BoardDTO board) {
		return session.update("com.hanwha.board.update",board);
	}



	
	
	
	
}
