package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
@RequestMapping(value = "/seven")
public class AppController {
	@GetMapping(value = "/one")
	public String functionOne() {
		return "success";
	}

	@GetMapping(value = "/")
	public String firstPage() {
		return "index";
	}

	// passing parameters
	@GetMapping(value = "/second/{userName}")
	public String secondPage(@PathVariable String userName, Model model) {
		Student student = new Student();
		student.setStdId(123);
		student.setStdName("Teja");
		System.out.println("userName: " + userName);
		model.addAttribute("key1", userName);
		model.addAttribute("key2", student);
		return "second";
	}

}
