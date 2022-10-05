package com.example.springboot.thymeleafdemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String sayHello(Model model) {
		model.addAttribute("currentDate", new Date());
		
		return "helloWorld";
	}

}
