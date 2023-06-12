package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
@RestController
@RequestMapping("/lewi")
public class PersonaController {
	
	@Autowired
	PersonaService x;
	
	
	@GetMapping
	public List<Persona>ver(){
		return x.ver();
	}
	
	
	@PostMapping("/save")
	public Persona registrar(@RequestBody Persona persona) {
		return x.registrar(persona);
	}
	
	
	@PutMapping("/mucho")
	public Persona actualizar(@RequestBody Persona persona) {
		return x.actualizar(persona);
	}
	
	@DeleteMapping("/mal/{persona}")
	public void eliminar(Persona persona) {
		x.eliminar(persona);
	}
}
