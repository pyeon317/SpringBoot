package com.coding404.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice1")
public class TopicController {

	@GetMapping("/topicListAll")
	public String listall() {
		return "practice1/topicListAll";
	}
	
	@GetMapping("/topicListMe")
	public String listme() {
		return "practice1/topicListMe";
	}
	
	@GetMapping("/topicModify")
	public String modify() {
		return "practice1/topicModify";
	}
	
	@GetMapping("/topicDetail")
	public String detail() {
		return "practice1/topicDetail";
	}
	
	@GetMapping("/topicReg")
	public String reg() {
		return "practice1/topicReg";
	}
	
}
