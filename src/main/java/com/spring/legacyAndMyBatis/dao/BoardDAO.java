package com.spring.legacyAndMyBatis.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.spring.legacyAndMyBatis.dto.BoardDTO;

@Repository
public class BoardDAO {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sql;
	
	private static final String NAMESPACE = "Board_Mapper.";
	
	public List<BoardDTO> select() {
		return sql.selectList(NAMESPACE + "select");
	}

}
