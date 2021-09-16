package com.example.carros.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
	@Autowired
	private carroRepository rep;
	
	public Iterable<Carro> getCarros(){
		return rep.findAll();
	}
	
}
