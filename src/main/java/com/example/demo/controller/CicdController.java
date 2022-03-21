package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CicdController {
	
	@GetMapping("/orders")
	public String show() {
		return "yes";
	}

}
