package com.bolsaideas.spring.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariableRuta {

	@GetMapping("/string/{texto}")
	public String variables(
			@PathVariable String texto,
			Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta");
		model.addAttribute("resultado","El texto envuado es:" + texto);
		return "variables/ver";
	}
}
