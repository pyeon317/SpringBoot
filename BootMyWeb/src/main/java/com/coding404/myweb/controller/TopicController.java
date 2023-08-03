package com.coding404.myweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.product.service.TopicService;
import com.coding404.myweb.util.Criteria;
import com.coding404.myweb.util.PageVO;

@Controller
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@GetMapping({"/topicListAll", "/ListAll", "/listall", "/topicListall"})
	public String listAll(Model model, Criteria cri) {
		
		
		ArrayList<TopicVO>listAll = topicService.getListAll();
		model.addAttribute("list", listAll);
		
//		int total = productService.getTotal(writer, cri);
//		PageVO pageVO = new PageVO(cri, total);
//		
//		model.addAttribute("list", list);
//		model.addAttribute("pageVO", pageVO);
		
		return "practice1/topicListAll";
	}
	
	@GetMapping({"/topicListMe", "/ListMe", "/listme", "/topicListme"})
	public String listMe(Model model, Criteria cri) {
		
		//로그인 기능이 없으므로, admin이라는 계정기반으로 조회
		String writer = "admin";
		
		ArrayList<TopicVO> listMe = topicService.getListMe(writer);
		model.addAttribute("list", listMe);
		
//		int total = productService.getTotal(writer, cri);
//		PageVO pageVO = new PageVO(cri, total);
//		
//		model.addAttribute("list", list);
//		model.addAttribute("pageVO", pageVO);
		
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
	
	@GetMapping({"/topicReg", "/Reg", "/reg", "topicreg"})
	public String reg() {
		return "practice1/topicReg";
	}
	
	@PostMapping("topic_regForm")
	public String topic_regForm(TopicVO vo, RedirectAttributes ra) {
		
		int result = topicService.topicRegist(vo);
		
		System.out.println(result);
		
		return "redirect:/topicListAll";
	}
	
	@PostMapping("topic_modifyForm")
	public String topic_modifyForm() {
		return "redirect:/practice1/topicListAll";
	}
	
}
