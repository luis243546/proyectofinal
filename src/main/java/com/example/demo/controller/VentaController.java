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

import com.example.demo.entity.Venta;
import com.example.demo.service.VentaService;

@RestController
@RequestMapping("/request")
public class VentaController {

	@Autowired
	VentaService p;
	
	
	@GetMapping
	public List<Venta>ver(){
		return p.ver();
	}
	
	
	@PostMapping("/pma")
	public Venta registrar(@RequestBody Venta venta) {
		return p.registrar(venta);
	}
	
	
	@PutMapping("/pmap")
	public Venta actualizar(@RequestBody Venta venta) {
		return p.actualizar(venta);
	}
	
	
	@DeleteMapping("/dma/{idventa}")
	public void eliminar(Venta venta) {
		p.eliminar(venta);
	}
}
