package ch06_06;

import java.sql.Date;

public class Board {
	
	private String id; // 글쓴이 아이디
	private String title; // 글 제목
	private String content; // 글 내용
	private Date writeDate; // 글쓴 날짜시간
	
	// DTO class
	
	// 생성자
	
	public Board(String id, String title, String content, Date writeDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
	}
	
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// getter setter 메소드
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	
}
