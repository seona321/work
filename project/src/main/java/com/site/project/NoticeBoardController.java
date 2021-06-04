package com.site.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import noticeBoard.model.NoticeBoardDAO;

@Controller
public class NoticeBoardController {

	
	@Autowired
	private NoticeBoardDAO nbDAO;

	
	@RequestMapping("/noticeBoard.do")
	public ModelAndView nbList() {
		List list = nbDAO.boardList();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("noticeBoard");
		return mav;
	}
	
	
}
