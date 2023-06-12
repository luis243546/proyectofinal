package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	
	@Autowired
	PersonaRepository a;
	
	
	@Override
	public Persona registrar(Persona persona) {
		// TODO Auto-generated method stub
		return a.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return a.save(persona);
	}

	@Override
	public void eliminar(Persona persona) {
		// TODO Auto-generated method stub
		a.delete(persona);
	}

	@Override
	public List<Persona> ver() {
		// TODO Auto-generated method stub
		return a.findAll();
	}

}
