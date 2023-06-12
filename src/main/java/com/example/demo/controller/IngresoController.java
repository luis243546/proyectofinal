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

import com.example.demo.entity.Ingreso;
import com.example.demo.service.IngresoService;

@RestController
@RequestMapping("/luis")
public class IngresoController {

	@Autowired
	IngresoService p;
	
	
	@GetMapping
	public List<Ingreso>ver(){
		return p.ver();
	}
	
	@PostMapping("/poma")
	public Ingreso registrar(@RequestBody Ingreso ingreso) {
		return p.registrar(ingreso);
	}
	
	@PutMapping("/puma")
	public Ingreso actualizar(@RequestBody Ingreso ingreso) {
		return p.actualizar(ingreso);
	}
	
	
	@DeleteMapping("/dema/{ingreso}")
	public void eliminar(Ingreso ingreso) {
		p.eliminar(ingreso);
	}
}
