package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Persona;

public interface PersonaService {
	
	public Persona registrar(Persona persona);
	public Persona actualizar(Persona persona);
	public void eliminar(Persona persona);
	
	public List<Persona>ver();
}
