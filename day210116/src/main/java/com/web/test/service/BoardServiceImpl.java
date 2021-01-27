package com.web.test.service;

import java.util.List;
import java.util.Map;

public interface BoardServiceImpl {

	public List<Map<String, Object>> listFreeBoard();
	
	public Map<String, Object> getFreeBoard(Map<String, Object> map);
	
	public int insertFreeBoard(Map<String, Object> map);
	
	public int updateFreeBoard(Map<String, Object> map);
	
	public int deleteFreeBoard(int num);
}
