package com.spring.legacyAndMyBatis.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.legacyAndMyBatis.dto.BoardDTO;
import com.spring.legacyAndMyBatis.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	private MessageSource messageSource;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);	
	
	/* 게시판 CRUD */
	@GetMapping("/board")
	public String board(Model model) {
		logger.info("BoardController 작동 확인");
		
		List<BoardDTO> board = boardService.select();
		
		if (board != null && board.size() > 0){
			model.addAttribute("board", boardService.select());
		}
		for ( BoardDTO dto : board) {
			System.err.println(dto.getBoardContent());
			logger.info(dto.getBoardContent());
		}
		
		return "board";
	}
	
}
