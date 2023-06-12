package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Venta;

public interface VentaService {

	public Venta registrar(Venta venta);
	public Venta actualizar(Venta venta);
	public void eliminar(Venta venta);
	
	public List<Venta>ver();
}
