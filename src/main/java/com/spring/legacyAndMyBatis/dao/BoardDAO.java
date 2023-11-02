package com.spring.legacyAndMyBatis.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.spring.legacyAndMyBatis.dto.BoardDTO;

@Repository
public class BoardDAO {
	/* MyBatis를 이용할 때에는 데이터 접근을 위한 객체로서 보통 DAO를 이용 
	 * sqlSession 객체를 이용해 데이터베이스 조회를 전담
	 * root-context에서 sqlSession을 빈으로 등록한 뒤 DAO 작성 
	 * NAMESPACE = SQL mapper를 찾기 위함
	 * @Resource를 사용하던 @Autowired를 사용하던 SqlSession을 가져오면 됨 
	 * 작성한 DAO는 Service에서 호출되어, 클라이언트와 서버간 상호 작용하는 코드를 작성 */
	
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sql;
	
	private static final String NAMESPACE = "Board_Mapper.";
	
	public List<BoardDTO> select() {
		return sql.selectList(NAMESPACE + "select");
	}

	public int insert(BoardDTO dto) {
		return sql.insert(NAMESPACE + "insert", dto);
		
	}

	public BoardDTO selectOne(int boardNo) {
		return sql.selectOne(NAMESPACE + "selectOne", boardNo);
	}
	
	/* 조회수 증가 */
	public int countUpdate(int boardCount) {
		return sql.update(NAMESPACE + "countUpdate", boardCount);
	}

}
