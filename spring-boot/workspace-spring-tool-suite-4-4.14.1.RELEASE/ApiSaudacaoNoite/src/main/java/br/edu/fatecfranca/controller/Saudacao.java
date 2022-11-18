package br.edu.fatecfranca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// vamos avisar que essa classe responde 
// requisição RestFull
@RestController
// vai responder pela rota /api/saudacao
@RequestMapping("/api/saudacao")
public class Saudacao {
	
	@GetMapping
	public String boaNoite() {
		return "Tenham todos uma boa noite";
	}
	
	@GetMapping("/{nome}")
	public String boanoite(@PathVariable String nome) {
		return " Tenham todos uma boa noite " + nome;
	}
	
}
