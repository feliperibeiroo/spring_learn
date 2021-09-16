package com.example.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {
	
	@GetMapping
	@RequestMapping
	public String sayHello() {
		return "Funcionando!";
	}

	@GetMapping
	@RequestMapping("/hello/{nome}")
	public String sayName(@PathVariable("nome") String nome) {
		return "Nome enviado = " + nome;
	}
		
}
