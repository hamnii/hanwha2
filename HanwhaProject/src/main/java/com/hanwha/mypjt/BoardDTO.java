package com.hanwha.mypjt;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class BoardDTO {
	
private String title;
//private String id
private String member_id;
private int bno;
private String content;
private Date writedate;
private String fileName;
MultipartFile uploadfile;
/*
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getWritedate() {
	return writedate;
}
public void setWritedate(Date writedate) {
	this.writedate = writedate;
}
@Override
public String toString() {
	return "BoardDTO [title=" + title + ", id=" + id + ", bno=" + bno + ", content=" + content + ", writedate="
			+ writedate + "]";
}

public MultipartFile getUploadfile() {
	return uploadfile;
}
public void setUploadfile(MultipartFile uploadfile) {
	this.uploadfile = uploadfile;
}


public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName=fileName;
}

*/
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getMember_id() {
	return member_id;
}
public void setMember_id(String member_id) {
	this.member_id = member_id;
}
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getWritedate() {
	return writedate;
}
public void setWritedate(Date writedate) {
	this.writedate = writedate;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public MultipartFile getUploadfile() {
	return uploadfile;
}
public void setUploadfile(MultipartFile uploadfile) {
	this.uploadfile = uploadfile;
}
@Override
public String toString() {
	return "BoardDTO [title=" + title + ", member_id=" + member_id + ", bno=" + bno + ", content=" + content
			+ ", writedate=" + writedate + ", fileName=" + fileName + ", uploadfile=" + uploadfile + "]";
}



}
