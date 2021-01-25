package com.web.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.web.test.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/main")
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("boardMain");
		return mav;
	}
	
	@RequestMapping("/insertBoard")
	@ResponseBody
	public Map<String, Object> insertBoard(HttpServletRequest request, Map<String, Object> board) {
		int re = 0;
		re = boardService.insertFreeBoard(board);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("re", re);
		return resultMap;
	}
	
	
}
