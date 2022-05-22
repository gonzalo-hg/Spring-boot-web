package com.bolsaideas.spring.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller//Componente de Srping como controlador
public class IndexControllers {
	
	/**
	 * Un controlador muestra metodos controladores 
	 * handler y representan una pagina web
	 * cada metodo maneja una vista o una pagina web
	 */
	
	//El requesMapping es de tipo get
	@GetMapping(path = {"/index","/","/home"})
	public String index() {
		return "index";
	}

}
