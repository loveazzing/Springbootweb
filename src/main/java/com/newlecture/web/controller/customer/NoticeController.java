 package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	
	@RequestMapping("list")
	public String list(Model model) {
		
		int page = 1;
		String field = "title";
		String query = "";
		boolean pub = false;
		
		
		List<NoticeView> list = service.getViewList(page, field, query, pub); 
		model.addAttribute("list", list);
		
		//System.out.println(service.getCount("title", ""));
		
		return "customer.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		return "customer.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		
		return "";
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "";
	}
	
	@RequestMapping("del")
	public String del() {
		
		return "";
	}
}
