package com.spring.legacyAndMyBatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.legacyAndMyBatis.dao.BoardDAO;
import com.spring.legacyAndMyBatis.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO boardDao;

	public List<BoardDTO> select() {
		return boardDao.select();
	}

	public void insert(BoardDTO dto) {
		boardDao.insert(dto);
		
	}

	public BoardDTO selectDetail(int boardNo) {
		return boardDao.selectOne(boardNo);
	}

//	public void countUpdate(int boardCount) {
//		boardDao.countUpdate(boardCount);
//	}
	
	public int countUpdate(int boardCount) {
		return boardDao.countUpdate(boardCount);
	}

}
