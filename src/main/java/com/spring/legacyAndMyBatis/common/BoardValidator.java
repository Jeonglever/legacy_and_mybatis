package com.spring.legacyAndMyBatis.common;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.legacyAndMyBatis.dto.BoardDTO;



public class BoardValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return BoardDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		BoardDTO board = (BoardDTO) target;
		
		if(board.getUserId() == null || board.getUserId() == "") {
			errors.rejectValue("userId", "null");
		}
		
		if(board.getBoardTitle() == null || board.getBoardTitle() == "") {
			errors.rejectValue("title", "null");
		}
		
		if(board.getBoardContent() == null || board.getBoardContent() == "") {
			errors.rejectValue("content", "null");
		}
		
		
		
	}

}
