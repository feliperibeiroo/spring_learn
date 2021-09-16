package com.example.carros.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarroService {
	
	public List<Carro> getCarros(){
		List<Carro> carros = new ArrayList<>();
		
		carros.add(Carro(1L, "Fusca"));
		carros.add(Carro(2L, "Gol"));
		carros.add(Carro(3L, "Brasília"));
		
		return carros;
	}
	
}
