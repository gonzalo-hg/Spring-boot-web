package com.bolsaideas.spring.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsaideas.spring.web.app.model.Usuario;

@Controller//Componente de Srping como controlador
@RequestMapping("/app")
public class IndexControllers {

	@Value("@{${texto.indexcontroller.index.titulo}}")
	private String textoIndex;
	@Value("@{${texto.indexcontroller.perfil.titulo}}")
	private String textPerfil;
	@Value("@{${texto.indexcontroller.listar.titulo}}")
	private String textoListar;
	
	/**
	 * Un controlador muestra metodos controladores 
	 * handler y representan una pagina web
	 * cada metodo maneja una vista o una pagina web
	 */
	
	//El requesMapping es de tipo get
	@GetMapping(path = {"/index","/","/home",""})
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Gonzalo");
		usuario.setApellido("Hernandez");
		usuario.setEmail("gonzalo@gmail.com");
		
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo", textPerfil.concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Gonzalo","Gonzalez","zalo@gmail.com"),
				new Usuario("Gonzalo1","Gonzalez","zalo@gmail.com"),
				new Usuario("Gonzalo2","Gonzalez","zalo@gmail.com"),
				new Usuario("Gonzalo3","Gonzalez","zalo@gmail.com"));
		
		return usuarios;
	}
	
	
}
