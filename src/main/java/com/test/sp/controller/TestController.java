package com.test.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.sp.controller.vo.TestVO;

@Controller
public class TestController {
	@PostMapping("/test")
	public String upload(TestVO tvo, Model model) {
		model.addAttribute("tvo", tvo);
		return "complete";
	}

	@GetMapping("/test")
	public String complete() {
		return "upload";
	}
}
