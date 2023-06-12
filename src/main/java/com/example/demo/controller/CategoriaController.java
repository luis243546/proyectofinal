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

import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService t;
	
	@GetMapping
	public List<Categoria>ver(){
		return t.ver();
	}
	
	
	@PostMapping("/post")
	public Categoria registrar(@RequestBody Categoria categoria) {
		return t.registrar(categoria);
	}
	
	
	@PutMapping("/put")
	public Categoria actualizar(@RequestBody Categoria categoria) {
		return t.actualizar(categoria);
	}
	
	
	@DeleteMapping("delete/{categoria}")
	public void eliminar(Categoria categoria) {
		t.eliminar(categoria);
	}
	
	
	
}
