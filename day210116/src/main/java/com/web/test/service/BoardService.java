package com.web.test.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardServiceImpl {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Map<String, Object>> listFreeBoard() {
		return sqlSessionTemplate.selectList("listFreeBoard");
	}

	@Override
	public Map<String, Object> getFreeBoard(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("getFreeBoard", map);
	}

	@Override
	public int insertFreeBoard(Map<String, Object> map) {
		return sqlSessionTemplate.insert("insertFreeBoard", map);
	}

	@Override
	public int updateFreeBoard(Map<String, Object> map) {
		return sqlSessionTemplate.update("updateFreeBoard", map);
	}

	@Override
	public int deleteFreeBoard(int num) {
		return sqlSessionTemplate.delete("deleteFreeBoard", num);
	}

}
