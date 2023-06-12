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

import com.example.demo.entity.Articulo;
import com.example.demo.service.ArticuloService;

@RestController
@RequestMapping("/ver")
public class ArticuloController {

	@Autowired
	ArticuloService y;
	
	
	@GetMapping("/vertodo")
	public List<Articulo>ver(){
		return y.ver();
	}
	
	
	@PostMapping("vision")
	public Articulo registrar(@RequestBody Articulo articulo) {
		return y.registrar(articulo);
	}
	
	
	@PutMapping("/vista")
	public Articulo actualiza(@RequestBody Articulo articulo) {
		return y.actualizar(articulo);
	}
	
	
	@DeleteMapping("/lejos/{articulo}")
	public void eliminar(Articulo articulo) {
		y.eliminar(articulo);
	}
		
}


