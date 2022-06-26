package com.bolsaideas.spring.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsControllers {
	
	@RequestMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(
			@RequestParam(name ="texto", required = false)String texto,
			Model model) {
		model.addAttribute("resultado","EL parametro enviado es: " + texto);
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(
			@RequestParam String texto,
			@RequestParam Integer numero,
			Model model) {
		model.addAttribute("resultado","EL saludo enviado es: " + texto+
				"y el numero es: " + numero);
		return "params/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String param(
			HttpServletRequest request,
			Model model) {
		 String texto = request.getParameter("saludo");
		 Integer numero = null;
		 try {
			 numero = Integer.parseInt(request.getParameter("numero"));

		 }
		 catch (NumberFormatException e) {
			// TODO: handle exception
			 numero =0;
		}
		model.addAttribute("resultado","EL saludo enviado es: " + texto+
				"y el numero es: " + numero);
		return "params/ver";
	}
}
