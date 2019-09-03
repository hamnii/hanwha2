package com.hanwha.mypjt;

import java.sql.Date;

public class BoardDTO {
	
private String title;
private String id;
private int bno;
private String content;
private Date writedate;

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




}
