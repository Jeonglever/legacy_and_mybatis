package com.spring.legacyAndMyBatis.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.legacyAndMyBatis.common.BoardValidator;
import com.spring.legacyAndMyBatis.dto.BoardDTO;
import com.spring.legacyAndMyBatis.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	private MessageSource messageSource;
	private BoardValidator boardValidator;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);	
	
	/* 게시판 CRUD */
	/* 게시판 조회 */
	@GetMapping("/board")
	public String board(Model model) {
		logger.info("[BoardController] read");
		
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
	
	@GetMapping("/insert")
	public void insert(Model model) {
		model.addAttribute("board", new BoardDTO());
		logger.info("[BoardController] Insert GetMapping");
	}
	
	/* 게시판 등록 */
	@PostMapping("/insert")
	public String insert(@Valid @ModelAttribute("board") BoardDTO dto, BindingResult result) throws BindException {
		logger.info("[BoardController] Insert PostMapping");
		
		if(result.hasErrors()) {
			System.err.println("에러 발생");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error: errors) {
				System.err.println(error.getDefaultMessage());
			}
			
			return "/insert";
		}
		
		boardService.insert(dto);
		
		logger.info("[BoardController] Insert End");
		return "redirect:/board";
		
	}
}
