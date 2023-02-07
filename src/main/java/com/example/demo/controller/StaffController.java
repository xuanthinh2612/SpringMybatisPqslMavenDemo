package com.example.demo.controller;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;

@Controller
@RequestMapping("/staff/")
public class StaffController {

	@Autowired
	StaffService staffService;

	@GetMapping("list")
	public String listStaff(Model model) {
		List<Staff> staffs = staffService.findAll();
		model.addAttribute("staffs", staffs);
		return "staff/list";
	}

	@GetMapping("new")
	public String newStaff(Model model) {
		model.addAttribute("staff", new Staff());
		return "staff/new";
	}

	@PostMapping("new")
	public String createStaff(@ModelAttribute @Valid Staff staff, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "staff/new";
		}
		staffService.save(staff);
		model.addAttribute("staff", staff);
		return "/staff/createdStaff";
	}

	@GetMapping("detail/{id}")
	public String detaiStaff(@PathVariable Long id, Model model) {
		Staff staff = staffService.findById(id);
		model.addAttribute("staff", staff);
		return "staff/show";
	}

	@GetMapping("update/{id}")
	public String showUpdatePage(@PathVariable Long id, Model model) {
		Staff staff = staffService.findById(id);
		model.addAttribute("staff", staff);
		return "staff/update";
	}

	@PostMapping("update")
	public String updateStaff(@ModelAttribute @Valid Staff staff, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "/staff/update";
		}
		staffService.update(staff);
		return "redirect:/staff/list";
	}

	@PostMapping("delete/{id}")
	public String deleteStaff(@PathVariable Long id) {
		staffService.delete(id);
		return "redirect:/staff/list";
	}

}
