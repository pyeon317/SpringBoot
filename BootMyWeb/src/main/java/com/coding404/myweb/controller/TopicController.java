package com.coding404.myweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.product.service.TopicService;

@Controller
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@GetMapping({"/topicListAll", "/ListAll", "/listall"})
	public String listAll() {
		
		//ArrayList<TopicVO vo>listAll = topicService.getListAll(top_id);
		
		return "practice1/topicListAll";
	}
	
	@GetMapping({"/topicListMe", "/ListMe", "/listme"})
	public String listMe() {
		
		//ArrayList<TopicVO vo> listMe = topicService.getListMe(top_writer);
		
		return "practice1/topicListMe";
	}
	
	//내 글일 경우에는 디테일이 아닌 모디파이로 넘어가도록 해야함?
	@GetMapping({"/topicModify", "/Modify", "/modify"})
	public String modify() {
		
		
		
		return "practice1/topicModify";
	}
	
	@GetMapping({"/topicDetail", "/Detail", "/detail"})
	public String detail() {
		return "practice1/topicDetail";
	}
	
	@GetMapping({"/topicReg", "/Reg", "/reg"})
	public String reg() {
		return "practice1/topicReg";
	}
	
	@PostMapping("topic_regForm")
	public String topic_regForm() {
		return "redirect:/practice1/topicListAll";
	}
	
	@PostMapping("topic_modifyForm")
	public String topic_modifyForm() {
		return "redirect:/practice1/topicListAll";
	}
	
}
