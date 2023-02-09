package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/homepage")
public class DashBoardController {
	
	@Autowired
	DepartmentService departmentService;

	@GetMapping
	public String dashBoard(Model model) {
		System.out.println(departmentService.findAll());
		return "dashboard/index";
	}
}
