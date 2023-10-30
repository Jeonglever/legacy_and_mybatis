package com.spring.legacyAndMyBatis.dto;

import java.util.Date;

public class BoardDTO {
	
	private String userId;
	
	private int boardNo;
	
	private String boardContent;
	
	private String boardTitle;
	
	private Date boardDate;
	
	private int boardCount;

	
	
	
	public BoardDTO() {};
	
	public BoardDTO(String userId, int boardNo, String boardContent, String boardTitle, Date boardDate,
			int boardCount) {
		super();
		this.userId = userId;
		this.boardNo = boardNo;
		this.boardContent = boardContent;
		this.boardTitle = boardTitle;
		this.boardDate = boardDate;
		this.boardCount = boardCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public int getBoardCount() {
		return boardCount;
	}

	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}
	
	

}
