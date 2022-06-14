package com.bolsaideas.spring.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsaideas.spring.web.app.model.Usuario;

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

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Gonzalo");
		usuario.setApellido("Hernandez");
		usuario.setEmail("gonzalo@gmail.com");
		
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		
		
		
		model.addAttribute("titulo", "Listado de  usaurios:");

		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Gonzalo","Gonzalez","zalo@gmail.com"),
				new Usuario("Gonzalo1","Gonzalez","zalo@gmail.com"),
				new Usuario("Gonzalo2","Gonzalez","zalo@gmail.com"),
				new Usuario("Gonzalo3","Gonzalez","zalo@gmail.com"));
		
		return usuarios;
		
	}
}
