package com.example.spring_jsp_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_jsp_form.model.User;
import com.example.spring_jsp_form.model.UserList;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	// UserList class created previously to simulate database
	private UserList userList = new UserList();
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	// BindingResult will check if there is an error not in our form
	// @Valid to indicate the modelAttribute that needs server side validation
	
	@PostMapping("/submitForm")
	public String submitForm(@Valid @ModelAttribute("user") User user,
			BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			return "userForm";
		}
		userList.addUser(user);
		model.addAttribute("userList", userList);
		return "userList";
		
	}
	
	@GetMapping("/userList")
	public String showUserList(Model model) {
		model.addAttribute("userList", userList);
		return "userList";
	}

}
