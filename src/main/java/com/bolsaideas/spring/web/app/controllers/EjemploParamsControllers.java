package com.bolsaideas.spring.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/params")
public class EjemploParamsControllers {

	@GetMapping("/string")
	public String param(Model model) {
		return "params/ver";
	}
}
